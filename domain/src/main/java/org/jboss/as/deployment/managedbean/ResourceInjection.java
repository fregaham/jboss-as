/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.deployment.managedbean;

import org.jboss.msc.inject.Injector;
import org.jboss.msc.value.InjectedValue;

/**
 * Helper object used to coordinate resource injection.  This class will hold onto an injector and an injected value
 * to apply at injection time.
 *
 * @author John E. Bailey
 */
public class ResourceInjection <T> {
    private final Injector<T> injector;
    private final InjectedValue<T> value = new InjectedValue<T>();

    /**
     * Construct an instance with an injector.
     *
     * @param injector The injector
     */
    public ResourceInjection(Injector<T> injector) {
        this.injector = injector;
    }

    /**
     * Run the injection by passing the injected value into the injector.
     */
    public void inject() {
        injector.inject(value.getValue());
    }

    /**
     * Get the value injector.
     *
     * @return An injector
     */
    public Injector<T> getValueInjector() {
        return value;
    }
}