/*
 * libxjava -- utility library for cross-Java-platform development
 *             ${project.name}
 *
 * Copyright (c) 2010 Marcel Patzlaff (marcel.patzlaff@gmail.com)
 *
 * This library is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.libxjava.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class ScheduledTaskExecutor extends ScheduledThreadPoolExecutor {
    public ScheduledTaskExecutor(int initialPoolSize, int maxPoolSize, IThreadFactory threadFactory) {
        super(initialPoolSize, (ThreadFactory) threadFactory);
        setMaximumPoolSize(maxPoolSize);
    }
    
    @Override
    public TaskContext<?> submit(Runnable task) {
        return (TaskContext<?>) super.submit(task);
    }

    public TaskContext<?> schedule(Runnable r, long delayInMillis) {
        return (TaskContext<?>) super.schedule(r, delayInMillis, TimeUnit.MILLISECONDS);
    }
    
    public TaskContext<?> scheduleAtFixedRate(Runnable r, long delayInMillis, long periodInMillis) {
        return (TaskContext<?>) super.scheduleAtFixedRate(r, delayInMillis, periodInMillis, TimeUnit.MILLISECONDS);
    }
    
    @Override
    protected final void afterExecute(Runnable r, Throwable t) {
        afterExecute((TaskContext) r, t);
        super.afterExecute(r, t);
    }

    @Override
    protected final void beforeExecute(Thread t, Runnable r) {
        beforeExecute(t, (TaskContext) r);
        super.beforeExecute(t, r);
    }

    protected void beforeExecute(Thread workThread, TaskContext task) {
        // do nothing
    }
    
    protected void afterExecute(TaskContext task, Throwable t) {
        task.future= null;
    }
    
    @Override
    protected final <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> task) {
        TaskContext<V> ctx= (TaskContext<V>) createTaskContext();
        ctx.future= task;
        return ctx;
    }

    @Override
    protected final <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> task) {
        TaskContext<V> ctx= (TaskContext<V>) createTaskContext();
        ctx.future= task;
        return ctx;
    }

    protected TaskContext<?> createTaskContext() {
        return new TaskContext();
    }
}
