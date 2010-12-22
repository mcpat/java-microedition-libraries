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


/**
 *
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class ScheduledTaskExecutor {
    public ScheduledTaskExecutor(int initialPoolSize, int maxPoolSize, IThreadFactory threadFactory) {
        
    }
    
    public TaskContext submit(Runnable task) {
        return null;
    }
    
    public TaskContext schedule(Runnable r, long delayInMillis) {
        return null;
    }
    
    public TaskContext scheduleAtFixedRate(Runnable r, long delayInMillis, long periodInMillis) {
        return null;
    }
    
    protected void beforeExecute(Thread workThread, TaskContext ctx) {
        // do nothing
    }
    
    protected void afterExecute(TaskContext ctx, Throwable t) {
        // do nothing
    }
    
    protected TaskContext createTaskContext() {
        return new TaskContext();
    }
}
