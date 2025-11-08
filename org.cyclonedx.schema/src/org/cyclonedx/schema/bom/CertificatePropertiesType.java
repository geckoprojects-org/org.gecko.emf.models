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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectName <em>Subject Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidBefore <em>Not Valid Before</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidAfter <em>Not Valid After</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSignatureAlgorithmRef <em>Signature Algorithm Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectPublicKeyRef <em>Subject Public Key Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateFormat <em>Certificate Format</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateExtension <em>Certificate Extension</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType()
 * @model extendedMetaData="name='certificateProperties_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CertificatePropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The subject name for the certificate
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Name</em>' attribute.
	 * @see #setSubjectName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_SubjectName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='subjectName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubjectName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectName <em>Subject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Name</em>' attribute.
	 * @see #getSubjectName()
	 * @generated
	 */
	void setSubjectName(String value);

	/**
	 * Returns the value of the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The issuer name for the certificate
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Name</em>' attribute.
	 * @see #setIssuerName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_IssuerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='issuerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssuerName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getIssuerName <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Name</em>' attribute.
	 * @see #getIssuerName()
	 * @generated
	 */
	void setIssuerName(String value);

	/**
	 * Returns the value of the '<em><b>Not Valid Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time according to ISO-8601 standard from which the certificate is valid
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Valid Before</em>' attribute.
	 * @see #setNotValidBefore(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_NotValidBefore()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='notValidBefore' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getNotValidBefore();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidBefore <em>Not Valid Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Valid Before</em>' attribute.
	 * @see #getNotValidBefore()
	 * @generated
	 */
	void setNotValidBefore(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Not Valid After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time according to ISO-8601 standard from which the certificate is not valid anymore
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Valid After</em>' attribute.
	 * @see #setNotValidAfter(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_NotValidAfter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='notValidAfter' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getNotValidAfter();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getNotValidAfter <em>Not Valid After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Valid After</em>' attribute.
	 * @see #getNotValidAfter()
	 * @generated
	 */
	void setNotValidAfter(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Signature Algorithm Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The bom-ref to signature algorithm used by the certificate
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Algorithm Ref</em>' attribute.
	 * @see #setSignatureAlgorithmRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_SignatureAlgorithmRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='signatureAlgorithmRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSignatureAlgorithmRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSignatureAlgorithmRef <em>Signature Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm Ref</em>' attribute.
	 * @see #getSignatureAlgorithmRef()
	 * @generated
	 */
	void setSignatureAlgorithmRef(String value);

	/**
	 * Returns the value of the '<em><b>Subject Public Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The bom-ref to the public key of the subject
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Public Key Ref</em>' attribute.
	 * @see #setSubjectPublicKeyRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_SubjectPublicKeyRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='subjectPublicKeyRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubjectPublicKeyRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getSubjectPublicKeyRef <em>Subject Public Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Public Key Ref</em>' attribute.
	 * @see #getSubjectPublicKeyRef()
	 * @generated
	 */
	void setSubjectPublicKeyRef(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The format of the certificate. Examples include X.509, PEM, DER, and CVC
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Format</em>' attribute.
	 * @see #setCertificateFormat(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_CertificateFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='certificateFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCertificateFormat();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateFormat <em>Certificate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Format</em>' attribute.
	 * @see #getCertificateFormat()
	 * @generated
	 */
	void setCertificateFormat(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The file extension of the certificate. Examples include crt, pem, cer, der, and p12.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Extension</em>' attribute.
	 * @see #setCertificateExtension(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCertificatePropertiesType_CertificateExtension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='certificateExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCertificateExtension();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CertificatePropertiesType#getCertificateExtension <em>Certificate Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Extension</em>' attribute.
	 * @see #getCertificateExtension()
	 * @generated
	 */
	void setCertificateExtension(String value);

} // CertificatePropertiesType
