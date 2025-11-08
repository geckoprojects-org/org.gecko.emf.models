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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getCipherSuites <em>Cipher Suites</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getIkev2TransformTypes <em>Ikev2 Transform Types</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getCryptoRef <em>Crypto Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getProtocolPropertiesType()
 * @model extendedMetaData="name='protocolProperties_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProtocolPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The concrete protocol type.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProtocolPropertiesType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The version of the protocol. Examples include 1.0, 1.2, and 1.99.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProtocolPropertiesType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Cipher Suites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     A list of cipher suites related to the protocol.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cipher Suites</em>' containment reference.
	 * @see #setCipherSuites(CipherSuitesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProtocolPropertiesType_CipherSuites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cipherSuites' namespace='##targetNamespace'"
	 * @generated
	 */
	CipherSuitesType getCipherSuites();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getCipherSuites <em>Cipher Suites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipher Suites</em>' containment reference.
	 * @see #getCipherSuites()
	 * @generated
	 */
	void setCipherSuites(CipherSuitesType value);

	/**
	 * Returns the value of the '<em><b>Ikev2 Transform Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The IKEv2 transform types supported (types 1-4), defined in RFC7296 section 3.3.2,
	 *                                     and additional properties.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ikev2 Transform Types</em>' containment reference.
	 * @see #setIkev2TransformTypes(Ikev2TransformTypesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProtocolPropertiesType_Ikev2TransformTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ikev2TransformTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	Ikev2TransformTypesType getIkev2TransformTypes();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType#getIkev2TransformTypes <em>Ikev2 Transform Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ikev2 Transform Types</em>' containment reference.
	 * @see #getIkev2TransformTypes()
	 * @generated
	 */
	void setIkev2TransformTypes(Ikev2TransformTypesType value);

	/**
	 * Returns the value of the '<em><b>Crypto Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol-related cryptographic assets
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crypto Ref</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProtocolPropertiesType_CryptoRef()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='cryptoRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCryptoRef();

} // ProtocolPropertiesType
