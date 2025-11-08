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
 * A representation of the model object '<em><b>Ikev2 Transform Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getEncr <em>Encr</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getPrf <em>Prf</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getInteg <em>Integ</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getKe <em>Ke</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#isEsn <em>Esn</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#getAuth <em>Auth</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getIkev2TransformTypesType()
 * @model extendedMetaData="name='ikev2TransformTypes_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Ikev2TransformTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Encr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Transform Type 1: encryption algorithms
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encr</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIkev2TransformTypesType_Encr()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='encr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEncr();

	/**
	 * Returns the value of the '<em><b>Prf</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Transform Type 2: pseudorandom functions
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prf</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIkev2TransformTypesType_Prf()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='prf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getPrf();

	/**
	 * Returns the value of the '<em><b>Integ</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Transform Type 3: integrity algorithms
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integ</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIkev2TransformTypesType_Integ()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='integ' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getInteg();

	/**
	 * Returns the value of the '<em><b>Ke</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Transform Type 4: Key Exchange Method (KE) per RFC9370, formerly called Diffie-Hellman Group (D-H)
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ke</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIkev2TransformTypesType_Ke()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='ke' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getKe();

	/**
	 * Returns the value of the '<em><b>Esn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Specifies if an Extended Sequence Number (ESN) is used.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Esn</em>' attribute.
	 * @see #isSetEsn()
	 * @see #unsetEsn()
	 * @see #setEsn(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIkev2TransformTypesType_Esn()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='esn' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEsn();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#isEsn <em>Esn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Esn</em>' attribute.
	 * @see #isSetEsn()
	 * @see #unsetEsn()
	 * @see #isEsn()
	 * @generated
	 */
	void setEsn(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#isEsn <em>Esn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEsn()
	 * @see #isEsn()
	 * @see #setEsn(boolean)
	 * @generated
	 */
	void unsetEsn();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType#isEsn <em>Esn</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Esn</em>' attribute is set.
	 * @see #unsetEsn()
	 * @see #isEsn()
	 * @see #setEsn(boolean)
	 * @generated
	 */
	boolean isSetEsn();

	/**
	 * Returns the value of the '<em><b>Auth</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 IKEv2 Authentication method
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIkev2TransformTypesType_Auth()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='auth' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAuth();

} // Ikev2TransformTypesType
