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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DependencyType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DependencyType#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DependencyType#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DependencyType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DependencyType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDependencyType()
 * @model extendedMetaData="name='dependencyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DependencyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDependencyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component or service that is a dependency of this dependency object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDependencyType_Dependency()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DependencyType> getDependency();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.ProvidesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The component or service that define a given specification or standard, which is provided or implemented by this dependency object.
	 *                         For example, a cryptographic library which implements a cryptographic algorithm. A component which implements another component does not imply that the implementation is in use.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDependencyType_Provides()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='provides' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProvidesType> getProvides();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a component or service by its bom-ref attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDependencyType_Ref()
	 * @model dataType="org.cyclonedx.schema.bom.RefLinkType" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DependencyType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                     do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDependencyType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DependencyType
