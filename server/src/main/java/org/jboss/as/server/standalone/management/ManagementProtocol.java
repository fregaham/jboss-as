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

package org.jboss.as.server.standalone.management;

/**
 * @author John Bailey
 */
public interface ManagementProtocol {
    // Headers
    byte[] SIGNATURE = {Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.MIN_VALUE};
    int VERSION_FIELD = 0x00; // The version field header
    int VERSION = 1; // The current protocol version

    int REQUEST_START = 0x01;
    int REQUEST_END = 0x02;
    int RESPONSE_START = 0x03;
    int RESPONSE_END = 0x04;

    int DOMAIN_CONTROLLER_REQUEST = 0x05;
    int SERVER_MANAGER_REQUEST = 0x06;
    int DOMAIN_CONTROLLER_CLIENT_REQUEST = 0x0A;

    // Domain Controller requests
    int PARAM_SERVER_MANAGER_ID = 0x07;
    int PARAM_SERVER_MANAGER_HOST = 0x08;
    int PARAM_SERVER_MANAGER_PORT = 0x09;
    int REQUEST_OPERATION = 0x10;
    int REGISTER_REQUEST = 0x11;
    int PARAM_HOST_MODEL = 0x12;
    int PARAM_DOMAIN_MODEL = 0x13;
    int REGISTER_RESPONSE = 0x14;
    int UNREGISTER_REQUEST = 0x15;
    int UNREGISTER_RESPONSE = 0x16;
    int SYNC_FILE_REQUEST = 0x17;
    int PARAM_ROOT_ID = 0x18;
    int PARAM_FILE_PATH = 0x19;
    int PARAM_NUM_FILES = 0x20;
    int PARAM_FILE_SIZE = 0x21;
    int FILE_START = 0x22;
    int FILE_END = 0x23;
    int SYNC_FILE_RESPONSE = 0x24;

    // Server Manager requests
    int UPDATE_FULL_DOMAIN_REQUEST = 0x25;
    int UPDATE_FULL_DOMAIN_RESPONSE = 0x26;
    int UPDATE_DOMAIN_MODEL_REQUEST = 0x27;
    int PARAM_DOMAIN_MODEL_UPDATE_COUNT = 0x28;
    int PARAM_DOMAIN_MODEL_UPDATE = 0x29;
    int PARAM_MODEL_UPDATE_RESPONSE_COUNT = 0x30;
    int PARAM_MODEL_UPDATE_RESPONSE = 0x31;
    int UPDATE_DOMAIN_MODEL_RESPONSE = 0x32;
    int UPDATE_HOST_MODEL_REQUEST = 0x33;
    int PARAM_HOST_MODEL_UPDATE_COUNT = 0x34;
    int PARAM_HOST_MODEL_UPDATE = 0x35;
    int UPDATE_HOST_MODEL_RESPONSE = 0x36;
    int IS_ACTIVE_REQUEST = 0x37;
    int IS_ACTIVE_RESPONSE = 0x38;
    int UPDATE_SERVER_MODEL_REQUEST = 0x39;
    int PARAM_SERVER_NAME = 0x40;
    int PARAM_SERVER_MODEL_UPDATE_COUNT = 0x41;
    int PARAM_SERVER_MODEL_UPDATE = 0x42;
    int UPDATE_SERVER_MODEL_RESPONSE = 0x43;

    // Standalone server
    int APPLY_UPDATES_REQUEST = 0x45;
    int EXECUTE_DEPLOYMENT_PLAN_REQUEST = 0x51;
    int ADD_DEPLOYMENT_CONTENT_REQUEST = 0x55;
    int CHECK_UNIQUE_DEPLOYMENT_NAME_REQUEST = 0x62;

    int SERVER_CONTROLLER_REQUEST = 0x75;
    int GET_SERVER_MODEL_REQUEST = 0x76;
    int GET_SERVER_MODEL_RESPONSE = 0x77;
    int PARAM_SERVER_MODEL = 0x78;
    int APPLY_UPDATE_RESULT_SERVER_MODEL_SUCCESS = 0x79;
}