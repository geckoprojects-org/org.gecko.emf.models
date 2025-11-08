/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.cyclonedx.schema.bom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getClassification()
 * @model extendedMetaData="name='classification'"
 * @generated
 */
@ProviderType
public enum Classification implements Enumerator {
	/**
	 * The '<em><b>Application</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software application. Refer to https://en.wikipedia.org/wiki/Application_software
	 *                         for information about applications.
	 * <!-- end-model-doc -->
	 * @see #APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION(0, "application", "application"),

	/**
	 * The '<em><b>Framework</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software framework. Refer to https://en.wikipedia.org/wiki/Software_framework
	 *                         for information on how frameworks vary slightly from libraries.
	 * <!-- end-model-doc -->
	 * @see #FRAMEWORK_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMEWORK(1, "framework", "framework"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software library. Refer to https://en.wikipedia.org/wiki/Library_(computing)
	 *                         for information about libraries. All third-party and open source reusable components will likely
	 *                         be a library. If the library also has key features of a framework, then it should be classified
	 *                         as a framework. If not, or is unknown, then specifying library is recommended.
	 * <!-- end-model-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(2, "library", "library"),

	/**
	 * The '<em><b>Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A packaging and/or runtime format, not specific to any particular technology,
	 *                         which isolates software inside the container from software outside of a container through
	 *                         virtualization technology. Refer to https://en.wikipedia.org/wiki/OS-level_virtualization
	 * <!-- end-model-doc -->
	 * @see #CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINER(3, "container", "container"),

	/**
	 * The '<em><b>Platform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A runtime environment which interprets or executes software. This may include
	 *                         runtimes such as those that execute bytecode or low-code/no-code application platforms.
	 * <!-- end-model-doc -->
	 * @see #PLATFORM_VALUE
	 * @generated
	 * @ordered
	 */
	PLATFORM(4, "platform", "platform"),

	/**
	 * The '<em><b>Operating System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software operating system without regard to deployment model
	 *                         (i.e. installed on physical hardware, virtual machine, image, etc) Refer to
	 *                         https://en.wikipedia.org/wiki/Operating_system
	 * <!-- end-model-doc -->
	 * @see #OPERATING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATING_SYSTEM(5, "operatingSystem", "operating-system"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A hardware device such as a processor, or chip-set. A hardware device
	 *                         containing firmware SHOULD include a component for the physical hardware itself, and another
	 *                         component of type 'firmware' or 'operating-system' (whichever is relevant), describing
	 *                         information about the software running on the device.
	 *                         See also the list of known device properties: https://github.com/CycloneDX/cyclonedx-property-taxonomy/blob/main/cdx/device.md
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(6, "device", "device"),

	/**
	 * The '<em><b>Device Driver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A special type of software that operates or controls a particular type of device.
	 *                         Refer to https://en.wikipedia.org/wiki/Device_driver
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DRIVER_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_DRIVER(7, "deviceDriver", "device-driver"),

	/**
	 * The '<em><b>Firmware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A special type of software that provides low-level control over a devices
	 *                         hardware. Refer to https://en.wikipedia.org/wiki/Firmware
	 * <!-- end-model-doc -->
	 * @see #FIRMWARE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMWARE(8, "firmware", "firmware"),

	/**
	 * The '<em><b>File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A computer file. Refer to https://en.wikipedia.org/wiki/Computer_file
	 *                         for information about files.
	 * <!-- end-model-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(9, "file", "file"),

	/**
	 * The '<em><b>Machine Learning Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A model based on training data that can make predictions or decisions without
	 *                         being explicitly programmed to do so.
	 * <!-- end-model-doc -->
	 * @see #MACHINE_LEARNING_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	MACHINE_LEARNING_MODEL(10, "machineLearningModel", "machine-learning-model"),

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of discrete values that convey information.
	 * <!-- end-model-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(11, "data", "data"),

	/**
	 * The '<em><b>Cryptographic Asset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cryptographic asset including algorithms, protocols, certificates, keys, tokens, and secrets.
	 * <!-- end-model-doc -->
	 * @see #CRYPTOGRAPHIC_ASSET_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTOGRAPHIC_ASSET(12, "cryptographicAsset", "cryptographic-asset");

	/**
	 * The '<em><b>Application</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software application. Refer to https://en.wikipedia.org/wiki/Application_software
	 *                         for information about applications.
	 * <!-- end-model-doc -->
	 * @see #APPLICATION
	 * @model name="application"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VALUE = 0;

	/**
	 * The '<em><b>Framework</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software framework. Refer to https://en.wikipedia.org/wiki/Software_framework
	 *                         for information on how frameworks vary slightly from libraries.
	 * <!-- end-model-doc -->
	 * @see #FRAMEWORK
	 * @model name="framework"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMEWORK_VALUE = 1;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software library. Refer to https://en.wikipedia.org/wiki/Library_(computing)
	 *                         for information about libraries. All third-party and open source reusable components will likely
	 *                         be a library. If the library also has key features of a framework, then it should be classified
	 *                         as a framework. If not, or is unknown, then specifying library is recommended.
	 * <!-- end-model-doc -->
	 * @see #LIBRARY
	 * @model name="library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 2;

	/**
	 * The '<em><b>Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A packaging and/or runtime format, not specific to any particular technology,
	 *                         which isolates software inside the container from software outside of a container through
	 *                         virtualization technology. Refer to https://en.wikipedia.org/wiki/OS-level_virtualization
	 * <!-- end-model-doc -->
	 * @see #CONTAINER
	 * @model name="container"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_VALUE = 3;

	/**
	 * The '<em><b>Platform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A runtime environment which interprets or executes software. This may include
	 *                         runtimes such as those that execute bytecode or low-code/no-code application platforms.
	 * <!-- end-model-doc -->
	 * @see #PLATFORM
	 * @model name="platform"
	 * @generated
	 * @ordered
	 */
	public static final int PLATFORM_VALUE = 4;

	/**
	 * The '<em><b>Operating System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A software operating system without regard to deployment model
	 *                         (i.e. installed on physical hardware, virtual machine, image, etc) Refer to
	 *                         https://en.wikipedia.org/wiki/Operating_system
	 * <!-- end-model-doc -->
	 * @see #OPERATING_SYSTEM
	 * @model name="operatingSystem" literal="operating-system"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SYSTEM_VALUE = 5;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A hardware device such as a processor, or chip-set. A hardware device
	 *                         containing firmware SHOULD include a component for the physical hardware itself, and another
	 *                         component of type 'firmware' or 'operating-system' (whichever is relevant), describing
	 *                         information about the software running on the device.
	 *                         See also the list of known device properties: https://github.com/CycloneDX/cyclonedx-property-taxonomy/blob/main/cdx/device.md
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 6;

	/**
	 * The '<em><b>Device Driver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A special type of software that operates or controls a particular type of device.
	 *                         Refer to https://en.wikipedia.org/wiki/Device_driver
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DRIVER
	 * @model name="deviceDriver" literal="device-driver"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_DRIVER_VALUE = 7;

	/**
	 * The '<em><b>Firmware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A special type of software that provides low-level control over a devices
	 *                         hardware. Refer to https://en.wikipedia.org/wiki/Firmware
	 * <!-- end-model-doc -->
	 * @see #FIRMWARE
	 * @model name="firmware"
	 * @generated
	 * @ordered
	 */
	public static final int FIRMWARE_VALUE = 8;

	/**
	 * The '<em><b>File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A computer file. Refer to https://en.wikipedia.org/wiki/Computer_file
	 *                         for information about files.
	 * <!-- end-model-doc -->
	 * @see #FILE
	 * @model name="file"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_VALUE = 9;

	/**
	 * The '<em><b>Machine Learning Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A model based on training data that can make predictions or decisions without
	 *                         being explicitly programmed to do so.
	 * <!-- end-model-doc -->
	 * @see #MACHINE_LEARNING_MODEL
	 * @model name="machineLearningModel" literal="machine-learning-model"
	 * @generated
	 * @ordered
	 */
	public static final int MACHINE_LEARNING_MODEL_VALUE = 10;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of discrete values that convey information.
	 * <!-- end-model-doc -->
	 * @see #DATA
	 * @model name="data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 11;

	/**
	 * The '<em><b>Cryptographic Asset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A cryptographic asset including algorithms, protocols, certificates, keys, tokens, and secrets.
	 * <!-- end-model-doc -->
	 * @see #CRYPTOGRAPHIC_ASSET
	 * @model name="cryptographicAsset" literal="cryptographic-asset"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOGRAPHIC_ASSET_VALUE = 12;

	/**
	 * An array of all the '<em><b>Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Classification[] VALUES_ARRAY =
		new Classification[] {
			APPLICATION,
			FRAMEWORK,
			LIBRARY,
			CONTAINER,
			PLATFORM,
			OPERATING_SYSTEM,
			DEVICE,
			DEVICE_DRIVER,
			FIRMWARE,
			FILE,
			MACHINE_LEARNING_MODEL,
			DATA,
			CRYPTOGRAPHIC_ASSET,
		};

	/**
	 * A public read-only list of all the '<em><b>Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Classification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Classification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Classification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Classification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Classification get(int value) {
		switch (value) {
			case APPLICATION_VALUE: return APPLICATION;
			case FRAMEWORK_VALUE: return FRAMEWORK;
			case LIBRARY_VALUE: return LIBRARY;
			case CONTAINER_VALUE: return CONTAINER;
			case PLATFORM_VALUE: return PLATFORM;
			case OPERATING_SYSTEM_VALUE: return OPERATING_SYSTEM;
			case DEVICE_VALUE: return DEVICE;
			case DEVICE_DRIVER_VALUE: return DEVICE_DRIVER;
			case FIRMWARE_VALUE: return FIRMWARE;
			case FILE_VALUE: return FILE;
			case MACHINE_LEARNING_MODEL_VALUE: return MACHINE_LEARNING_MODEL;
			case DATA_VALUE: return DATA;
			case CRYPTOGRAPHIC_ASSET_VALUE: return CRYPTOGRAPHIC_ASSET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Classification(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Classification
