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
package org.w3._1999.xlink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *     Intended for use as the type of user-declared elements to make them
 *     extended links.
 *     Note that the elements referenced in the content model are all abstract.
 *     The intention is that by simply declaring elements with these as their
 *     substitutionGroup, all the right things will happen.
 *    
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xlink.Extended#getExtendedModel <em>Extended Model</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getTitleGroup <em>Title Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getLocatorGroup <em>Locator Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getLocator <em>Locator</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getArcGroup <em>Arc Group</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getArc <em>Arc</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getRole <em>Role</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.w3._1999.xlink.Extended#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xlink.XlinkPackage#getExtended()
 * @model extendedMetaData="name='extended' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Extended extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended Model</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Model</em>' attribute list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_ExtendedModel()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ExtendedModel:0'"
	 * @generated
	 */
	FeatureMap getExtendedModel();

	/**
	 * Returns the value of the '<em><b>Title Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Group</em>' attribute list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_TitleGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='title:group' namespace='##targetNamespace' group='#ExtendedModel:0'"
	 * @generated
	 */
	FeatureMap getTitleGroup();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xlink.TitleEltType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_Title()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='title:group'"
	 * @generated
	 */
	EList<TitleEltType> getTitle();

	/**
	 * Returns the value of the '<em><b>Resource Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group</em>' attribute list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_ResourceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='resource:group' namespace='##targetNamespace' group='#ExtendedModel:0'"
	 * @generated
	 */
	FeatureMap getResourceGroup();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xlink.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_Resource()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace' group='resource:group'"
	 * @generated
	 */
	EList<ResourceType> getResource();

	/**
	 * Returns the value of the '<em><b>Locator Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locator Group</em>' attribute list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_LocatorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='locator:group' namespace='##targetNamespace' group='#ExtendedModel:0'"
	 * @generated
	 */
	FeatureMap getLocatorGroup();

	/**
	 * Returns the value of the '<em><b>Locator</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xlink.LocatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locator</em>' containment reference list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_Locator()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locator' namespace='##targetNamespace' group='locator:group'"
	 * @generated
	 */
	EList<LocatorType> getLocator();

	/**
	 * Returns the value of the '<em><b>Arc Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc Group</em>' attribute list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_ArcGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='arc:group' namespace='##targetNamespace' group='#ExtendedModel:0'"
	 * @generated
	 */
	FeatureMap getArcGroup();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xlink.ArcType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference list.
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_Arc()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='arc' namespace='##targetNamespace' group='arc:group'"
	 * @generated
	 */
	EList<ArcType> getArc();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_Role()
	 * @model dataType="org.w3._1999.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.w3._1999.xlink.Extended#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Title1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title1</em>' attribute.
	 * @see #setTitle1(String)
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_Title1()
	 * @model dataType="org.w3._1999.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle1();

	/**
	 * Sets the value of the '{@link org.w3._1999.xlink.Extended#getTitle1 <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title1</em>' attribute.
	 * @see #getTitle1()
	 * @generated
	 */
	void setTitle1(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"extended"</code>.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.w3._1999.xlink.XlinkPackage#getExtended_Type()
	 * @model default="extended" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.w3._1999.xlink.Extended#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xlink.Extended#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xlink.Extended#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // Extended
