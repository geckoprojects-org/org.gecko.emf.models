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
package org.cyclonedx.schema.bom.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CertificatePropertiesType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getSubjectName <em>Subject Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getNotValidBefore <em>Not Valid Before</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getNotValidAfter <em>Not Valid After</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getSignatureAlgorithmRef <em>Signature Algorithm Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getSubjectPublicKeyRef <em>Subject Public Key Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getCertificateFormat <em>Certificate Format</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CertificatePropertiesTypeImpl#getCertificateExtension <em>Certificate Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificatePropertiesTypeImpl extends MinimalEObjectImpl.Container implements CertificatePropertiesType {
	/**
	 * The default value of the '{@link #getSubjectName() <em>Subject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectName() <em>Subject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectName()
	 * @generated
	 * @ordered
	 */
	protected String subjectName = SUBJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected String issuerName = ISSUER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotValidBefore() <em>Not Valid Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotValidBefore()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar NOT_VALID_BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotValidBefore() <em>Not Valid Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotValidBefore()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar notValidBefore = NOT_VALID_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotValidAfter() <em>Not Valid After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotValidAfter()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar NOT_VALID_AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotValidAfter() <em>Not Valid After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotValidAfter()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar notValidAfter = NOT_VALID_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureAlgorithmRef() <em>Signature Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithmRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithmRef() <em>Signature Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithmRef()
	 * @generated
	 * @ordered
	 */
	protected String signatureAlgorithmRef = SIGNATURE_ALGORITHM_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubjectPublicKeyRef() <em>Subject Public Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectPublicKeyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_PUBLIC_KEY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectPublicKeyRef() <em>Subject Public Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectPublicKeyRef()
	 * @generated
	 * @ordered
	 */
	protected String subjectPublicKeyRef = SUBJECT_PUBLIC_KEY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificateFormat() <em>Certificate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateFormat() <em>Certificate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateFormat()
	 * @generated
	 * @ordered
	 */
	protected String certificateFormat = CERTIFICATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificateExtension() <em>Certificate Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateExtension() <em>Certificate Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateExtension()
	 * @generated
	 * @ordered
	 */
	protected String certificateExtension = CERTIFICATE_EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificatePropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getCertificatePropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectName(String newSubjectName) {
		String oldSubjectName = subjectName;
		subjectName = newSubjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_NAME, oldSubjectName, subjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuerName() {
		return issuerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuerName(String newIssuerName) {
		String oldIssuerName = issuerName;
		issuerName = newIssuerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__ISSUER_NAME, oldIssuerName, issuerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getNotValidBefore() {
		return notValidBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotValidBefore(XMLGregorianCalendar newNotValidBefore) {
		XMLGregorianCalendar oldNotValidBefore = notValidBefore;
		notValidBefore = newNotValidBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_BEFORE, oldNotValidBefore, notValidBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getNotValidAfter() {
		return notValidAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotValidAfter(XMLGregorianCalendar newNotValidAfter) {
		XMLGregorianCalendar oldNotValidAfter = notValidAfter;
		notValidAfter = newNotValidAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_AFTER, oldNotValidAfter, notValidAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureAlgorithmRef() {
		return signatureAlgorithmRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureAlgorithmRef(String newSignatureAlgorithmRef) {
		String oldSignatureAlgorithmRef = signatureAlgorithmRef;
		signatureAlgorithmRef = newSignatureAlgorithmRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SIGNATURE_ALGORITHM_REF, oldSignatureAlgorithmRef, signatureAlgorithmRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectPublicKeyRef() {
		return subjectPublicKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectPublicKeyRef(String newSubjectPublicKeyRef) {
		String oldSubjectPublicKeyRef = subjectPublicKeyRef;
		subjectPublicKeyRef = newSubjectPublicKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_PUBLIC_KEY_REF, oldSubjectPublicKeyRef, subjectPublicKeyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateFormat() {
		return certificateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateFormat(String newCertificateFormat) {
		String oldCertificateFormat = certificateFormat;
		certificateFormat = newCertificateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_FORMAT, oldCertificateFormat, certificateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateExtension() {
		return certificateExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateExtension(String newCertificateExtension) {
		String oldCertificateExtension = certificateExtension;
		certificateExtension = newCertificateExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_EXTENSION, oldCertificateExtension, certificateExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_NAME:
				return getSubjectName();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__ISSUER_NAME:
				return getIssuerName();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_BEFORE:
				return getNotValidBefore();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_AFTER:
				return getNotValidAfter();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SIGNATURE_ALGORITHM_REF:
				return getSignatureAlgorithmRef();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_PUBLIC_KEY_REF:
				return getSubjectPublicKeyRef();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_FORMAT:
				return getCertificateFormat();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_EXTENSION:
				return getCertificateExtension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_NAME:
				setSubjectName((String)newValue);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__ISSUER_NAME:
				setIssuerName((String)newValue);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_BEFORE:
				setNotValidBefore((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_AFTER:
				setNotValidAfter((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SIGNATURE_ALGORITHM_REF:
				setSignatureAlgorithmRef((String)newValue);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_PUBLIC_KEY_REF:
				setSubjectPublicKeyRef((String)newValue);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_FORMAT:
				setCertificateFormat((String)newValue);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_EXTENSION:
				setCertificateExtension((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_NAME:
				setSubjectName(SUBJECT_NAME_EDEFAULT);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__ISSUER_NAME:
				setIssuerName(ISSUER_NAME_EDEFAULT);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_BEFORE:
				setNotValidBefore(NOT_VALID_BEFORE_EDEFAULT);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_AFTER:
				setNotValidAfter(NOT_VALID_AFTER_EDEFAULT);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SIGNATURE_ALGORITHM_REF:
				setSignatureAlgorithmRef(SIGNATURE_ALGORITHM_REF_EDEFAULT);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_PUBLIC_KEY_REF:
				setSubjectPublicKeyRef(SUBJECT_PUBLIC_KEY_REF_EDEFAULT);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_FORMAT:
				setCertificateFormat(CERTIFICATE_FORMAT_EDEFAULT);
				return;
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_EXTENSION:
				setCertificateExtension(CERTIFICATE_EXTENSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_NAME:
				return SUBJECT_NAME_EDEFAULT == null ? subjectName != null : !SUBJECT_NAME_EDEFAULT.equals(subjectName);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__ISSUER_NAME:
				return ISSUER_NAME_EDEFAULT == null ? issuerName != null : !ISSUER_NAME_EDEFAULT.equals(issuerName);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_BEFORE:
				return NOT_VALID_BEFORE_EDEFAULT == null ? notValidBefore != null : !NOT_VALID_BEFORE_EDEFAULT.equals(notValidBefore);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__NOT_VALID_AFTER:
				return NOT_VALID_AFTER_EDEFAULT == null ? notValidAfter != null : !NOT_VALID_AFTER_EDEFAULT.equals(notValidAfter);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SIGNATURE_ALGORITHM_REF:
				return SIGNATURE_ALGORITHM_REF_EDEFAULT == null ? signatureAlgorithmRef != null : !SIGNATURE_ALGORITHM_REF_EDEFAULT.equals(signatureAlgorithmRef);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__SUBJECT_PUBLIC_KEY_REF:
				return SUBJECT_PUBLIC_KEY_REF_EDEFAULT == null ? subjectPublicKeyRef != null : !SUBJECT_PUBLIC_KEY_REF_EDEFAULT.equals(subjectPublicKeyRef);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_FORMAT:
				return CERTIFICATE_FORMAT_EDEFAULT == null ? certificateFormat != null : !CERTIFICATE_FORMAT_EDEFAULT.equals(certificateFormat);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE__CERTIFICATE_EXTENSION:
				return CERTIFICATE_EXTENSION_EDEFAULT == null ? certificateExtension != null : !CERTIFICATE_EXTENSION_EDEFAULT.equals(certificateExtension);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (subjectName: ");
		result.append(subjectName);
		result.append(", issuerName: ");
		result.append(issuerName);
		result.append(", notValidBefore: ");
		result.append(notValidBefore);
		result.append(", notValidAfter: ");
		result.append(notValidAfter);
		result.append(", signatureAlgorithmRef: ");
		result.append(signatureAlgorithmRef);
		result.append(", subjectPublicKeyRef: ");
		result.append(subjectPublicKeyRef);
		result.append(", certificateFormat: ");
		result.append(certificateFormat);
		result.append(", certificateExtension: ");
		result.append(certificateExtension);
		result.append(')');
		return result.toString();
	}

} //CertificatePropertiesTypeImpl
