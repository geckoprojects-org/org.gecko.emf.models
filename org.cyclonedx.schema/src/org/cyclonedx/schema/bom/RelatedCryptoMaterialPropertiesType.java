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

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Crypto Material Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getId <em>Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getState <em>State</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getAlgorithmRef <em>Algorithm Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getActivationDate <em>Activation Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSize <em>Size</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getFormat <em>Format</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSecuredBy <em>Secured By</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType()
 * @model extendedMetaData="name='relatedCryptoMaterialProperties_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RelatedCryptoMaterialPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.TypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The type for the related cryptographic material
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType1 getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.cyclonedx.schema.bom.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType1 value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The optional unique identifier for the related cryptographic material.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.StateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The key state as defined by NIST SP 800-57.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.cyclonedx.schema.bom.StateType
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	StateType getState();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.cyclonedx.schema.bom.StateType
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Algorithm Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The bom-ref to the algorithm used to generate the related cryptographic material.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm Ref</em>' attribute.
	 * @see #setAlgorithmRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_AlgorithmRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='algorithmRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlgorithmRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getAlgorithmRef <em>Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Ref</em>' attribute.
	 * @see #getAlgorithmRef()
	 * @generated
	 */
	void setAlgorithmRef(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time (timestamp) when the related cryptographic material was created.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='creationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Activation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time (timestamp) when the related cryptographic material was activated.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Date</em>' attribute.
	 * @see #setActivationDate(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_ActivationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='activationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActivationDate();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getActivationDate <em>Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Date</em>' attribute.
	 * @see #getActivationDate()
	 * @generated
	 */
	void setActivationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time (timestamp) when the related cryptographic material was updated.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_UpdateDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='updateDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getUpdateDate();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time (timestamp) when the related cryptographic material expires.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_ExpirationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpirationDate();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The associated value of the cryptographic material.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The size of the cryptographic asset (in bits).
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The format of the related cryptographic material (e.g. P8, PEM, DER).
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_Format()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Secured By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The mechanism by which the cryptographic asset is secured by.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secured By</em>' containment reference.
	 * @see #setSecuredBy(SecuredByType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRelatedCryptoMaterialPropertiesType_SecuredBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	SecuredByType getSecuredBy();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType#getSecuredBy <em>Secured By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secured By</em>' containment reference.
	 * @see #getSecuredBy()
	 * @generated
	 */
	void setSecuredBy(SecuredByType value);

} // RelatedCryptoMaterialPropertiesType
