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
 * A representation of the literals of the enumeration '<em><b>Lifecycle Phase Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getLifecyclePhaseType()
 * @model extendedMetaData="name='lifecyclePhaseType'"
 * @generated
 */
@ProviderType
public enum LifecyclePhaseType implements Enumerator {
	/**
	 * The '<em><b>Design</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM produced early in the development lifecycle containing inventory of components and services
	 *                         that are proposed or planned to be used. The inventory may need to be procured, retrieved,
	 *                         or resourced prior to use.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN(0, "design", "design"),

	/**
	 * The '<em><b>Pre Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information obtained prior to a build process and may contain source files
	 *                         and development artifacts and manifests. The inventory may need to be resolved and retrieved
	 *                         prior to use.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PRE_BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_BUILD(1, "preBuild", "pre-build"),

	/**
	 * The '<em><b>Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information obtained during a build process where component inventory is
	 *                         available for use. The precise versions of resolved components are usually available at this
	 *                         time as well as the provenance of where the components were retrieved from.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	BUILD(2, "build", "build"),

	/**
	 * The '<em><b>Post Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information obtained after a build process has completed and the resulting
	 *                         components(s) are available for further analysis. Built components may exist as the result of a
	 *                         CI/CD process, may have been installed or deployed to a system or device, and may need to be
	 *                         retrieved or extracted from the system or device.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #POST_BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	POST_BUILD(3, "postBuild", "post-build"),

	/**
	 * The '<em><b>Operations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM produced that represents inventory that is running and operational. This may include staging
	 *                         or production environments and will generally encompass multiple SBOMs describing the applications
	 *                         and operating system, along with HBOMs describing the hardware that makes up the system. Operations
	 *                         Bill of Materials (OBOM) can provide full-stack inventory of runtime environments, configurations,
	 *                         and additional dependencies.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OPERATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONS(4, "operations", "operations"),

	/**
	 * The '<em><b>Discovery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information observed through network discovery providing point-in-time
	 *                         enumeration of embedded, on-premise, and cloud-native services such as server applications,
	 *                         connected devices, microservices, and serverless functions.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DISCOVERY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERY(5, "discovery", "discovery"),

	/**
	 * The '<em><b>Decommission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM containing inventory that will be, or has been retired from operations.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DECOMMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	DECOMMISSION(6, "decommission", "decommission");

	/**
	 * The '<em><b>Design</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM produced early in the development lifecycle containing inventory of components and services
	 *                         that are proposed or planned to be used. The inventory may need to be procured, retrieved,
	 *                         or resourced prior to use.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DESIGN
	 * @model name="design"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_VALUE = 0;

	/**
	 * The '<em><b>Pre Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information obtained prior to a build process and may contain source files
	 *                         and development artifacts and manifests. The inventory may need to be resolved and retrieved
	 *                         prior to use.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PRE_BUILD
	 * @model name="preBuild" literal="pre-build"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_BUILD_VALUE = 1;

	/**
	 * The '<em><b>Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information obtained during a build process where component inventory is
	 *                         available for use. The precise versions of resolved components are usually available at this
	 *                         time as well as the provenance of where the components were retrieved from.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #BUILD
	 * @model name="build"
	 * @generated
	 * @ordered
	 */
	public static final int BUILD_VALUE = 2;

	/**
	 * The '<em><b>Post Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information obtained after a build process has completed and the resulting
	 *                         components(s) are available for further analysis. Built components may exist as the result of a
	 *                         CI/CD process, may have been installed or deployed to a system or device, and may need to be
	 *                         retrieved or extracted from the system or device.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #POST_BUILD
	 * @model name="postBuild" literal="post-build"
	 * @generated
	 * @ordered
	 */
	public static final int POST_BUILD_VALUE = 3;

	/**
	 * The '<em><b>Operations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM produced that represents inventory that is running and operational. This may include staging
	 *                         or production environments and will generally encompass multiple SBOMs describing the applications
	 *                         and operating system, along with HBOMs describing the hardware that makes up the system. Operations
	 *                         Bill of Materials (OBOM) can provide full-stack inventory of runtime environments, configurations,
	 *                         and additional dependencies.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OPERATIONS
	 * @model name="operations"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONS_VALUE = 4;

	/**
	 * The '<em><b>Discovery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM consisting of information observed through network discovery providing point-in-time
	 *                         enumeration of embedded, on-premise, and cloud-native services such as server applications,
	 *                         connected devices, microservices, and serverless functions.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DISCOVERY
	 * @model name="discovery"
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERY_VALUE = 5;

	/**
	 * The '<em><b>Decommission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         BOM containing inventory that will be, or has been retired from operations.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DECOMMISSION
	 * @model name="decommission"
	 * @generated
	 * @ordered
	 */
	public static final int DECOMMISSION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Lifecycle Phase Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LifecyclePhaseType[] VALUES_ARRAY =
		new LifecyclePhaseType[] {
			DESIGN,
			PRE_BUILD,
			BUILD,
			POST_BUILD,
			OPERATIONS,
			DISCOVERY,
			DECOMMISSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Lifecycle Phase Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LifecyclePhaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lifecycle Phase Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecyclePhaseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecyclePhaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Phase Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecyclePhaseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecyclePhaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Phase Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecyclePhaseType get(int value) {
		switch (value) {
			case DESIGN_VALUE: return DESIGN;
			case PRE_BUILD_VALUE: return PRE_BUILD;
			case BUILD_VALUE: return BUILD;
			case POST_BUILD_VALUE: return POST_BUILD;
			case OPERATIONS_VALUE: return OPERATIONS;
			case DISCOVERY_VALUE: return DISCOVERY;
			case DECOMMISSION_VALUE: return DECOMMISSION;
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
	private LifecyclePhaseType(int value, String name, String literal) {
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
	
} //LifecyclePhaseType
