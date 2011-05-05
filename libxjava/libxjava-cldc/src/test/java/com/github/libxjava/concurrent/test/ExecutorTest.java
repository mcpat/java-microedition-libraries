/*
 * libxjava - utility library for cross-Java-platform development
 *            ${project.name}
 *
 * Copyright (c) 2010-2011 Marcel Patzlaff (marcel.patzlaff@gmail.com)
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

package com.github.libxjava.concurrent.test;

import junit.framework.TestCase;

import com.github.libxjava.concurrent.IThreadFactory;
import com.github.libxjava.concurrent.ScheduledTaskExecutor;

/**
 *
 * @author Marcel Patzlaff
 */
public class ExecutorTest extends TestCase {
    public void testExecutor() throws Exception {
        ScheduledTaskExecutor executor= new ScheduledTaskExecutor(0, 2, 10000, new IThreadFactory() {
            public Thread newThread(Runnable r) {
                System.out.println("TC: creating new thread");
                return new Thread(r);
            }
        });
        
        executor.schedule(new Runnable() {
            public void run() {
                System.out.println("Hallo ERSTE");
            }
        }, 1000);
        
        executor.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("Hallo ZWEITE");
            }
        }, 1500, 1000);
        
        executor.schedule(new Runnable() {
            public void run() {
                System.out.println("Hallo DRITTE");
            }
        }, 1000);
        
        Thread.sleep(5000);
        executor.shutdown();
    }
    
    public static void main(String[] args) throws Exception {
        new ExecutorTest().testExecutor();
    }
}
