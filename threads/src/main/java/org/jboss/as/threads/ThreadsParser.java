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

package org.jboss.as.threads;

import org.jboss.as.model.ParseResult;
import org.jboss.staxmapper.XMLElementReader;
import org.jboss.staxmapper.XMLExtendedStreamReader;

import javax.xml.stream.XMLStreamException;

/**
 * The root element handler for threads subsystem elements.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public final class ThreadsParser implements XMLElementReader<ParseResult<? super ThreadsSubsystemElement>> {

    private static final ThreadsParser INSTANCE = new ThreadsParser();

    private ThreadsParser() {
    }

    /**
     * Get the instance.
     *
     * @return the instance
     */
    public static ThreadsParser getInstance() {
        return INSTANCE;
    }

    /** {@inheritDoc} */
    public void readElement(final XMLExtendedStreamReader reader, final ParseResult<? super ThreadsSubsystemElement> parseResult) throws XMLStreamException {
        parseResult.setResult(new ThreadsSubsystemElement(reader));
    }
}