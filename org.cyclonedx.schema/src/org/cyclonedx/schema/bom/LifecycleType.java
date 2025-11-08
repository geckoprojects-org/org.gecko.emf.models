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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.LifecycleType#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LifecycleType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LifecycleType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getLifecycleType()
 * @model extendedMetaData="name='lifecycle_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LifecycleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.LifecyclePhaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                     A pre-defined phase in the product lifecycle.
	 *                                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see org.cyclonedx.schema.bom.LifecyclePhaseType
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(LifecyclePhaseType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLifecycleType_Phase()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	LifecyclePhaseType getPhase();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LifecycleType#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see org.cyclonedx.schema.bom.LifecyclePhaseType
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(LifecyclePhaseType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.LifecycleType#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(LifecyclePhaseType)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.LifecycleType#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(LifecyclePhaseType)
	 * @generated
	 */
	boolean isSetPhase();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                     The name of the lifecycle phase
	 *                                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLifecycleType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LifecycleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                     The description of the lifecycle phase
	 *                                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLifecycleType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LifecycleType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // LifecycleType
