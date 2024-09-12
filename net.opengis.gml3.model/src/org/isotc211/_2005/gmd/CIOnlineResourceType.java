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

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Online Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about online sources from which the dataset, specification, or community profile name and extended metadata elements can be obtained.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CIOnlineResourceType#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIOnlineResourceType#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIOnlineResourceType#getApplicationProfile <em>Application Profile</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIOnlineResourceType#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIOnlineResourceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIOnlineResourceType#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCIOnlineResourceType()
 * @model extendedMetaData="name='CI_OnlineResource_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CIOnlineResourceType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Linkage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkage</em>' containment reference.
	 * @see #setLinkage(URLPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIOnlineResourceType_Linkage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='linkage' namespace='##targetNamespace'"
	 * @generated
	 */
	URLPropertyType getLinkage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIOnlineResourceType#getLinkage <em>Linkage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkage</em>' containment reference.
	 * @see #getLinkage()
	 * @generated
	 */
	void setLinkage(URLPropertyType value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIOnlineResourceType_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getProtocol();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIOnlineResourceType#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Application Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Profile</em>' containment reference.
	 * @see #setApplicationProfile(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIOnlineResourceType_ApplicationProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getApplicationProfile();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIOnlineResourceType#getApplicationProfile <em>Application Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Profile</em>' containment reference.
	 * @see #getApplicationProfile()
	 * @generated
	 */
	void setApplicationProfile(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIOnlineResourceType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIOnlineResourceType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIOnlineResourceType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIOnlineResourceType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(CIOnLineFunctionCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIOnlineResourceType_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	CIOnLineFunctionCodePropertyType getFunction();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIOnlineResourceType#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CIOnLineFunctionCodePropertyType value);

} // CIOnlineResourceType
