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

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class TaskContext<V> implements RunnableScheduledFuture<V> {
    /*package*/ RunnableScheduledFuture<V> future;
    
    protected TaskContext() {}
    
    public final boolean isCancelled() {
        return future.isCancelled();
    }

    public final boolean isPeriodic() {
        return future.isPeriodic();
    }

    public final boolean cancel(boolean mayInterruptIfRunning) {
        return future.cancel(mayInterruptIfRunning);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return future.get();
    }

    public final V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return future.get(timeout, unit);
    }

    public final boolean isDone() {
        return future.isDone();
    }

    public final int compareTo(Delayed o) {
        return future.compareTo(o);
    }

    public final void run() {
        future.run();
    }

    public final long getDelay(TimeUnit unit) {
        return future.getDelay(unit);
    }
}
