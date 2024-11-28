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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStatesType;
import org.emau.icmvc.ganimed.ttp.cm2.Qcdto;
import org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Light DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getConsentDates <em>Consent Dates</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#isHasPatientSignature <em>Has Patient Signature</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getModuleStates <em>Module States</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#isPatientSignatureIsFromGuardian <em>Patient Signature Is From Guardian</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getPatientSigningDate <em>Patient Signing Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getPatientSigningPlace <em>Patient Signing Place</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getPhysicianId <em>Physician Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getPhysicianSigningDate <em>Physician Signing Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getPhysicianSigningPlace <em>Physician Signing Place</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getQualityControl <em>Quality Control</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getTemplateType <em>Template Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentLightDTOImpl#getValidFromProperties <em>Valid From Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentLightDTOImpl extends FhirIdDTOImpl implements ConsentLightDTO {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsentDates() <em>Consent Dates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentDates()
	 * @generated
	 * @ordered
	 */
	protected ConsentDateValuesDTO consentDates;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpirationProperties() <em>Expiration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationProperties()
	 * @generated
	 * @ordered
	 */
	protected ExpirationPropertiesDTO expirationProperties;

	/**
	 * The default value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected String externProperties = EXTERN_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasPatientSignature() <em>Has Patient Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPatientSignature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PATIENT_SIGNATURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPatientSignature() <em>Has Patient Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPatientSignature()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPatientSignature = HAS_PATIENT_SIGNATURE_EDEFAULT;

	/**
	 * This is true if the Has Patient Signature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasPatientSignatureESet;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected ConsentKeyDTO key;

	/**
	 * The cached value of the '{@link #getModuleStates() <em>Module States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleStates()
	 * @generated
	 * @ordered
	 */
	protected ModuleStatesType moduleStates;

	/**
	 * The default value of the '{@link #isPatientSignatureIsFromGuardian() <em>Patient Signature Is From Guardian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPatientSignatureIsFromGuardian()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PATIENT_SIGNATURE_IS_FROM_GUARDIAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPatientSignatureIsFromGuardian() <em>Patient Signature Is From Guardian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPatientSignatureIsFromGuardian()
	 * @generated
	 * @ordered
	 */
	protected boolean patientSignatureIsFromGuardian = PATIENT_SIGNATURE_IS_FROM_GUARDIAN_EDEFAULT;

	/**
	 * This is true if the Patient Signature Is From Guardian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean patientSignatureIsFromGuardianESet;

	/**
	 * The default value of the '{@link #getPatientSigningDate() <em>Patient Signing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSigningDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PATIENT_SIGNING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatientSigningDate() <em>Patient Signing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSigningDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar patientSigningDate = PATIENT_SIGNING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatientSigningPlace() <em>Patient Signing Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSigningPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_SIGNING_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatientSigningPlace() <em>Patient Signing Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSigningPlace()
	 * @generated
	 * @ordered
	 */
	protected String patientSigningPlace = PATIENT_SIGNING_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicianId() <em>Physician Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianId()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICIAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicianId() <em>Physician Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianId()
	 * @generated
	 * @ordered
	 */
	protected String physicianId = PHYSICIAN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicianSigningDate() <em>Physician Signing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianSigningDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PHYSICIAN_SIGNING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicianSigningDate() <em>Physician Signing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianSigningDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar physicianSigningDate = PHYSICIAN_SIGNING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicianSigningPlace() <em>Physician Signing Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianSigningPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICIAN_SIGNING_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicianSigningPlace() <em>Physician Signing Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianSigningPlace()
	 * @generated
	 * @ordered
	 */
	protected String physicianSigningPlace = PHYSICIAN_SIGNING_PLACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualityControl() <em>Quality Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityControl()
	 * @generated
	 * @ordered
	 */
	protected Qcdto qualityControl;

	/**
	 * The default value of the '{@link #getTemplateType() <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateType()
	 * @generated
	 * @ordered
	 */
	protected static final ConsentTemplateType TEMPLATE_TYPE_EDEFAULT = ConsentTemplateType.CONSENT;

	/**
	 * The cached value of the '{@link #getTemplateType() <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateType()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateType templateType = TEMPLATE_TYPE_EDEFAULT;

	/**
	 * This is true if the Template Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean templateTypeESet;

	/**
	 * The default value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UPDATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar updateDate = UPDATE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar validFromDate = VALID_FROM_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidFromProperties() <em>Valid From Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromProperties()
	 * @generated
	 * @ordered
	 */
	protected ValidFromPropertiesDTO validFromProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentLightDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getConsentLightDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentDateValuesDTO getConsentDates() {
		return consentDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsentDates(ConsentDateValuesDTO newConsentDates, NotificationChain msgs) {
		ConsentDateValuesDTO oldConsentDates = consentDates;
		consentDates = newConsentDates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES, oldConsentDates, newConsentDates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsentDates(ConsentDateValuesDTO newConsentDates) {
		if (newConsentDates != consentDates) {
			NotificationChain msgs = null;
			if (consentDates != null)
				msgs = ((InternalEObject)consentDates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES, null, msgs);
			if (newConsentDates != null)
				msgs = ((InternalEObject)newConsentDates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES, null, msgs);
			msgs = basicSetConsentDates(newConsentDates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES, newConsentDates, newConsentDates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpirationPropertiesDTO getExpirationProperties() {
		return expirationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationProperties(ExpirationPropertiesDTO newExpirationProperties, NotificationChain msgs) {
		ExpirationPropertiesDTO oldExpirationProperties = expirationProperties;
		expirationProperties = newExpirationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES, oldExpirationProperties, newExpirationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationProperties(ExpirationPropertiesDTO newExpirationProperties) {
		if (newExpirationProperties != expirationProperties) {
			NotificationChain msgs = null;
			if (expirationProperties != null)
				msgs = ((InternalEObject)expirationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES, null, msgs);
			if (newExpirationProperties != null)
				msgs = ((InternalEObject)newExpirationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES, null, msgs);
			msgs = basicSetExpirationProperties(newExpirationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES, newExpirationProperties, newExpirationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternProperties() {
		return externProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternProperties(String newExternProperties) {
		String oldExternProperties = externProperties;
		externProperties = newExternProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__EXTERN_PROPERTIES, oldExternProperties, externProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasPatientSignature() {
		return hasPatientSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasPatientSignature(boolean newHasPatientSignature) {
		boolean oldHasPatientSignature = hasPatientSignature;
		hasPatientSignature = newHasPatientSignature;
		boolean oldHasPatientSignatureESet = hasPatientSignatureESet;
		hasPatientSignatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE, oldHasPatientSignature, hasPatientSignature, !oldHasPatientSignatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHasPatientSignature() {
		boolean oldHasPatientSignature = hasPatientSignature;
		boolean oldHasPatientSignatureESet = hasPatientSignatureESet;
		hasPatientSignature = HAS_PATIENT_SIGNATURE_EDEFAULT;
		hasPatientSignatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE, oldHasPatientSignature, HAS_PATIENT_SIGNATURE_EDEFAULT, oldHasPatientSignatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHasPatientSignature() {
		return hasPatientSignatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentKeyDTO getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(ConsentKeyDTO newKey, NotificationChain msgs) {
		ConsentKeyDTO oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(ConsentKeyDTO newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleStatesType getModuleStates() {
		return moduleStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleStates(ModuleStatesType newModuleStates, NotificationChain msgs) {
		ModuleStatesType oldModuleStates = moduleStates;
		moduleStates = newModuleStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES, oldModuleStates, newModuleStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleStates(ModuleStatesType newModuleStates) {
		if (newModuleStates != moduleStates) {
			NotificationChain msgs = null;
			if (moduleStates != null)
				msgs = ((InternalEObject)moduleStates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES, null, msgs);
			if (newModuleStates != null)
				msgs = ((InternalEObject)newModuleStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES, null, msgs);
			msgs = basicSetModuleStates(newModuleStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES, newModuleStates, newModuleStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPatientSignatureIsFromGuardian() {
		return patientSignatureIsFromGuardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientSignatureIsFromGuardian(boolean newPatientSignatureIsFromGuardian) {
		boolean oldPatientSignatureIsFromGuardian = patientSignatureIsFromGuardian;
		patientSignatureIsFromGuardian = newPatientSignatureIsFromGuardian;
		boolean oldPatientSignatureIsFromGuardianESet = patientSignatureIsFromGuardianESet;
		patientSignatureIsFromGuardianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN, oldPatientSignatureIsFromGuardian, patientSignatureIsFromGuardian, !oldPatientSignatureIsFromGuardianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPatientSignatureIsFromGuardian() {
		boolean oldPatientSignatureIsFromGuardian = patientSignatureIsFromGuardian;
		boolean oldPatientSignatureIsFromGuardianESet = patientSignatureIsFromGuardianESet;
		patientSignatureIsFromGuardian = PATIENT_SIGNATURE_IS_FROM_GUARDIAN_EDEFAULT;
		patientSignatureIsFromGuardianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN, oldPatientSignatureIsFromGuardian, PATIENT_SIGNATURE_IS_FROM_GUARDIAN_EDEFAULT, oldPatientSignatureIsFromGuardianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPatientSignatureIsFromGuardian() {
		return patientSignatureIsFromGuardianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getPatientSigningDate() {
		return patientSigningDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientSigningDate(XMLGregorianCalendar newPatientSigningDate) {
		XMLGregorianCalendar oldPatientSigningDate = patientSigningDate;
		patientSigningDate = newPatientSigningDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE, oldPatientSigningDate, patientSigningDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatientSigningPlace() {
		return patientSigningPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientSigningPlace(String newPatientSigningPlace) {
		String oldPatientSigningPlace = patientSigningPlace;
		patientSigningPlace = newPatientSigningPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE, oldPatientSigningPlace, patientSigningPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicianId() {
		return physicianId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicianId(String newPhysicianId) {
		String oldPhysicianId = physicianId;
		physicianId = newPhysicianId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_ID, oldPhysicianId, physicianId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getPhysicianSigningDate() {
		return physicianSigningDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicianSigningDate(XMLGregorianCalendar newPhysicianSigningDate) {
		XMLGregorianCalendar oldPhysicianSigningDate = physicianSigningDate;
		physicianSigningDate = newPhysicianSigningDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE, oldPhysicianSigningDate, physicianSigningDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicianSigningPlace() {
		return physicianSigningPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicianSigningPlace(String newPhysicianSigningPlace) {
		String oldPhysicianSigningPlace = physicianSigningPlace;
		physicianSigningPlace = newPhysicianSigningPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE, oldPhysicianSigningPlace, physicianSigningPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qcdto getQualityControl() {
		return qualityControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualityControl(Qcdto newQualityControl, NotificationChain msgs) {
		Qcdto oldQualityControl = qualityControl;
		qualityControl = newQualityControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL, oldQualityControl, newQualityControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualityControl(Qcdto newQualityControl) {
		if (newQualityControl != qualityControl) {
			NotificationChain msgs = null;
			if (qualityControl != null)
				msgs = ((InternalEObject)qualityControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL, null, msgs);
			if (newQualityControl != null)
				msgs = ((InternalEObject)newQualityControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL, null, msgs);
			msgs = basicSetQualityControl(newQualityControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL, newQualityControl, newQualityControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateType getTemplateType() {
		return templateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateType(ConsentTemplateType newTemplateType) {
		ConsentTemplateType oldTemplateType = templateType;
		templateType = newTemplateType == null ? TEMPLATE_TYPE_EDEFAULT : newTemplateType;
		boolean oldTemplateTypeESet = templateTypeESet;
		templateTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__TEMPLATE_TYPE, oldTemplateType, templateType, !oldTemplateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTemplateType() {
		ConsentTemplateType oldTemplateType = templateType;
		boolean oldTemplateTypeESet = templateTypeESet;
		templateType = TEMPLATE_TYPE_EDEFAULT;
		templateTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.CONSENT_LIGHT_DTO__TEMPLATE_TYPE, oldTemplateType, TEMPLATE_TYPE_EDEFAULT, oldTemplateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTemplateType() {
		return templateTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getUpdateDate() {
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateDate(XMLGregorianCalendar newUpdateDate) {
		XMLGregorianCalendar oldUpdateDate = updateDate;
		updateDate = newUpdateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__UPDATE_DATE, oldUpdateDate, updateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFromDate(XMLGregorianCalendar newValidFromDate) {
		XMLGregorianCalendar oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidFromPropertiesDTO getValidFromProperties() {
		return validFromProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidFromProperties(ValidFromPropertiesDTO newValidFromProperties, NotificationChain msgs) {
		ValidFromPropertiesDTO oldValidFromProperties = validFromProperties;
		validFromProperties = newValidFromProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES, oldValidFromProperties, newValidFromProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFromProperties(ValidFromPropertiesDTO newValidFromProperties) {
		if (newValidFromProperties != validFromProperties) {
			NotificationChain msgs = null;
			if (validFromProperties != null)
				msgs = ((InternalEObject)validFromProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES, null, msgs);
			if (newValidFromProperties != null)
				msgs = ((InternalEObject)newValidFromProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES, null, msgs);
			msgs = basicSetValidFromProperties(newValidFromProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES, newValidFromProperties, newValidFromProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES:
				return basicSetConsentDates(null, msgs);
			case Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES:
				return basicSetExpirationProperties(null, msgs);
			case Cm2Package.CONSENT_LIGHT_DTO__KEY:
				return basicSetKey(null, msgs);
			case Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES:
				return basicSetModuleStates(null, msgs);
			case Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL:
				return basicSetQualityControl(null, msgs);
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES:
				return basicSetValidFromProperties(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.CONSENT_LIGHT_DTO__COMMENT:
				return getComment();
			case Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES:
				return getConsentDates();
			case Cm2Package.CONSENT_LIGHT_DTO__CREATION_DATE:
				return getCreationDate();
			case Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES:
				return getExpirationProperties();
			case Cm2Package.CONSENT_LIGHT_DTO__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE:
				return isHasPatientSignature();
			case Cm2Package.CONSENT_LIGHT_DTO__KEY:
				return getKey();
			case Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES:
				return getModuleStates();
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN:
				return isPatientSignatureIsFromGuardian();
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE:
				return getPatientSigningDate();
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE:
				return getPatientSigningPlace();
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_ID:
				return getPhysicianId();
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE:
				return getPhysicianSigningDate();
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE:
				return getPhysicianSigningPlace();
			case Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL:
				return getQualityControl();
			case Cm2Package.CONSENT_LIGHT_DTO__TEMPLATE_TYPE:
				return getTemplateType();
			case Cm2Package.CONSENT_LIGHT_DTO__UPDATE_DATE:
				return getUpdateDate();
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_DATE:
				return getValidFromDate();
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES:
				return getValidFromProperties();
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
			case Cm2Package.CONSENT_LIGHT_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES:
				setConsentDates((ConsentDateValuesDTO)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE:
				setHasPatientSignature((Boolean)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__KEY:
				setKey((ConsentKeyDTO)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES:
				setModuleStates((ModuleStatesType)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN:
				setPatientSignatureIsFromGuardian((Boolean)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE:
				setPatientSigningDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE:
				setPatientSigningPlace((String)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_ID:
				setPhysicianId((String)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE:
				setPhysicianSigningDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE:
				setPhysicianSigningPlace((String)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL:
				setQualityControl((Qcdto)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__TEMPLATE_TYPE:
				setTemplateType((ConsentTemplateType)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__UPDATE_DATE:
				setUpdateDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_DATE:
				setValidFromDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES:
				setValidFromProperties((ValidFromPropertiesDTO)newValue);
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
			case Cm2Package.CONSENT_LIGHT_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES:
				setConsentDates((ConsentDateValuesDTO)null);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)null);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE:
				unsetHasPatientSignature();
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__KEY:
				setKey((ConsentKeyDTO)null);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES:
				setModuleStates((ModuleStatesType)null);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN:
				unsetPatientSignatureIsFromGuardian();
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE:
				setPatientSigningDate(PATIENT_SIGNING_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE:
				setPatientSigningPlace(PATIENT_SIGNING_PLACE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_ID:
				setPhysicianId(PHYSICIAN_ID_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE:
				setPhysicianSigningDate(PHYSICIAN_SIGNING_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE:
				setPhysicianSigningPlace(PHYSICIAN_SIGNING_PLACE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL:
				setQualityControl((Qcdto)null);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__TEMPLATE_TYPE:
				unsetTemplateType();
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES:
				setValidFromProperties((ValidFromPropertiesDTO)null);
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
			case Cm2Package.CONSENT_LIGHT_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.CONSENT_LIGHT_DTO__CONSENT_DATES:
				return consentDates != null;
			case Cm2Package.CONSENT_LIGHT_DTO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case Cm2Package.CONSENT_LIGHT_DTO__EXPIRATION_PROPERTIES:
				return expirationProperties != null;
			case Cm2Package.CONSENT_LIGHT_DTO__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.CONSENT_LIGHT_DTO__HAS_PATIENT_SIGNATURE:
				return isSetHasPatientSignature();
			case Cm2Package.CONSENT_LIGHT_DTO__KEY:
				return key != null;
			case Cm2Package.CONSENT_LIGHT_DTO__MODULE_STATES:
				return moduleStates != null;
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNATURE_IS_FROM_GUARDIAN:
				return isSetPatientSignatureIsFromGuardian();
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_DATE:
				return PATIENT_SIGNING_DATE_EDEFAULT == null ? patientSigningDate != null : !PATIENT_SIGNING_DATE_EDEFAULT.equals(patientSigningDate);
			case Cm2Package.CONSENT_LIGHT_DTO__PATIENT_SIGNING_PLACE:
				return PATIENT_SIGNING_PLACE_EDEFAULT == null ? patientSigningPlace != null : !PATIENT_SIGNING_PLACE_EDEFAULT.equals(patientSigningPlace);
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_ID:
				return PHYSICIAN_ID_EDEFAULT == null ? physicianId != null : !PHYSICIAN_ID_EDEFAULT.equals(physicianId);
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_DATE:
				return PHYSICIAN_SIGNING_DATE_EDEFAULT == null ? physicianSigningDate != null : !PHYSICIAN_SIGNING_DATE_EDEFAULT.equals(physicianSigningDate);
			case Cm2Package.CONSENT_LIGHT_DTO__PHYSICIAN_SIGNING_PLACE:
				return PHYSICIAN_SIGNING_PLACE_EDEFAULT == null ? physicianSigningPlace != null : !PHYSICIAN_SIGNING_PLACE_EDEFAULT.equals(physicianSigningPlace);
			case Cm2Package.CONSENT_LIGHT_DTO__QUALITY_CONTROL:
				return qualityControl != null;
			case Cm2Package.CONSENT_LIGHT_DTO__TEMPLATE_TYPE:
				return isSetTemplateType();
			case Cm2Package.CONSENT_LIGHT_DTO__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? updateDate != null : !UPDATE_DATE_EDEFAULT.equals(updateDate);
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case Cm2Package.CONSENT_LIGHT_DTO__VALID_FROM_PROPERTIES:
				return validFromProperties != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", hasPatientSignature: ");
		if (hasPatientSignatureESet) result.append(hasPatientSignature); else result.append("<unset>");
		result.append(", patientSignatureIsFromGuardian: ");
		if (patientSignatureIsFromGuardianESet) result.append(patientSignatureIsFromGuardian); else result.append("<unset>");
		result.append(", patientSigningDate: ");
		result.append(patientSigningDate);
		result.append(", patientSigningPlace: ");
		result.append(patientSigningPlace);
		result.append(", physicianId: ");
		result.append(physicianId);
		result.append(", physicianSigningDate: ");
		result.append(physicianSigningDate);
		result.append(", physicianSigningPlace: ");
		result.append(physicianSigningPlace);
		result.append(", templateType: ");
		if (templateTypeESet) result.append(templateType); else result.append("<unset>");
		result.append(", updateDate: ");
		result.append(updateDate);
		result.append(", validFromDate: ");
		result.append(validFromDate);
		result.append(')');
		return result.toString();
	}

} //ConsentLightDTOImpl
