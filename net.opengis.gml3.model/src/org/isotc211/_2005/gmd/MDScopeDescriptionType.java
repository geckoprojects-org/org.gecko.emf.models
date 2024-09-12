/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Scope Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Description of the class of information covered by the information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getFeatureInstances <em>Feature Instances</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getAttributeInstances <em>Attribute Instances</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDScopeDescriptionType()
 * @model extendedMetaData="name='MD_ScopeDescription_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDScopeDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.ObjectReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDScopeDescriptionType_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectReferencePropertyType> getAttributes();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.ObjectReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDScopeDescriptionType_Features()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='features' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectReferencePropertyType> getFeatures();

	/**
	 * Returns the value of the '<em><b>Feature Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.ObjectReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Instances</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDScopeDescriptionType_FeatureInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectReferencePropertyType> getFeatureInstances();

	/**
	 * Returns the value of the '<em><b>Attribute Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.ObjectReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Instances</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDScopeDescriptionType_AttributeInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectReferencePropertyType> getAttributeInstances();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDScopeDescriptionType_Dataset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDataset();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' containment reference.
	 * @see #setOther(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDScopeDescriptionType_Other()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='other' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getOther();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDScopeDescriptionType#getOther <em>Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' containment reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(CharacterStringPropertyType value);

} // MDScopeDescriptionType
