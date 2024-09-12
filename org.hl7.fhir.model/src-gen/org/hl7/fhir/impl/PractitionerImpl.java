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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Address;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerCommunication;
import org.hl7.fhir.PractitionerQualification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getDeceasedBoolean <em>Deceased Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getDeceasedDateTime <em>Deceased Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PractitionerImpl#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerImpl extends DomainResourceImpl implements Practitioner {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanName> name;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected AdministrativeGender gender;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate;

	/**
	 * The cached value of the '{@link #getDeceasedBoolean() <em>Deceased Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean deceasedBoolean;

	/**
	 * The cached value of the '{@link #getDeceasedDateTime() <em>Deceased Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime deceasedDateTime;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photo;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerQualification> qualification;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerCommunication> communication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getPractitioner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.PRACTITIONER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__ACTIVE, oldActive, newActive);
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
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HumanName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<HumanName>(HumanName.class, this, FHIRPackage.PRACTITIONER__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FHIRPackage.PRACTITIONER__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrativeGender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(AdministrativeGender newGender, NotificationChain msgs) {
		AdministrativeGender oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__GENDER, oldGender, newGender);
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
	public void setGender(AdministrativeGender newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthDate(Date newBirthDate, NotificationChain msgs) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__BIRTH_DATE, oldBirthDate, newBirthDate);
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
	public void setBirthDate(Date newBirthDate) {
		if (newBirthDate != birthDate) {
			NotificationChain msgs = null;
			if (birthDate != null)
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getDeceasedBoolean() {
		return deceasedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedBoolean(org.hl7.fhir.Boolean newDeceasedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDeceasedBoolean = deceasedBoolean;
		deceasedBoolean = newDeceasedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN, oldDeceasedBoolean, newDeceasedBoolean);
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
	public void setDeceasedBoolean(org.hl7.fhir.Boolean newDeceasedBoolean) {
		if (newDeceasedBoolean != deceasedBoolean) {
			NotificationChain msgs = null;
			if (deceasedBoolean != null)
				msgs = ((InternalEObject)deceasedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN, null, msgs);
			if (newDeceasedBoolean != null)
				msgs = ((InternalEObject)newDeceasedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN, null, msgs);
			msgs = basicSetDeceasedBoolean(newDeceasedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN, newDeceasedBoolean, newDeceasedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDeceasedDateTime() {
		return deceasedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedDateTime(DateTime newDeceasedDateTime, NotificationChain msgs) {
		DateTime oldDeceasedDateTime = deceasedDateTime;
		deceasedDateTime = newDeceasedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME, oldDeceasedDateTime, newDeceasedDateTime);
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
	public void setDeceasedDateTime(DateTime newDeceasedDateTime) {
		if (newDeceasedDateTime != deceasedDateTime) {
			NotificationChain msgs = null;
			if (deceasedDateTime != null)
				msgs = ((InternalEObject)deceasedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME, null, msgs);
			if (newDeceasedDateTime != null)
				msgs = ((InternalEObject)newDeceasedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME, null, msgs);
			msgs = basicSetDeceasedDateTime(newDeceasedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME, newDeceasedDateTime, newDeceasedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, FHIRPackage.PRACTITIONER__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getPhoto() {
		if (photo == null) {
			photo = new EObjectContainmentEList<Attachment>(Attachment.class, this, FHIRPackage.PRACTITIONER__PHOTO);
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PractitionerQualification> getQualification() {
		if (qualification == null) {
			qualification = new EObjectContainmentEList<PractitionerQualification>(PractitionerQualification.class, this, FHIRPackage.PRACTITIONER__QUALIFICATION);
		}
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PractitionerCommunication> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<PractitionerCommunication>(PractitionerCommunication.class, this, FHIRPackage.PRACTITIONER__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.PRACTITIONER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PRACTITIONER__ACTIVE:
				return basicSetActive(null, msgs);
			case FHIRPackage.PRACTITIONER__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PRACTITIONER__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PRACTITIONER__GENDER:
				return basicSetGender(null, msgs);
			case FHIRPackage.PRACTITIONER__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN:
				return basicSetDeceasedBoolean(null, msgs);
			case FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME:
				return basicSetDeceasedDateTime(null, msgs);
			case FHIRPackage.PRACTITIONER__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PRACTITIONER__PHOTO:
				return ((InternalEList<?>)getPhoto()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PRACTITIONER__QUALIFICATION:
				return ((InternalEList<?>)getQualification()).basicRemove(otherEnd, msgs);
			case FHIRPackage.PRACTITIONER__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.PRACTITIONER__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.PRACTITIONER__ACTIVE:
				return getActive();
			case FHIRPackage.PRACTITIONER__NAME:
				return getName();
			case FHIRPackage.PRACTITIONER__TELECOM:
				return getTelecom();
			case FHIRPackage.PRACTITIONER__GENDER:
				return getGender();
			case FHIRPackage.PRACTITIONER__BIRTH_DATE:
				return getBirthDate();
			case FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN:
				return getDeceasedBoolean();
			case FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME:
				return getDeceasedDateTime();
			case FHIRPackage.PRACTITIONER__ADDRESS:
				return getAddress();
			case FHIRPackage.PRACTITIONER__PHOTO:
				return getPhoto();
			case FHIRPackage.PRACTITIONER__QUALIFICATION:
				return getQualification();
			case FHIRPackage.PRACTITIONER__COMMUNICATION:
				return getCommunication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.PRACTITIONER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.PRACTITIONER__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.PRACTITIONER__NAME:
				getName().clear();
				getName().addAll((Collection<? extends HumanName>)newValue);
				return;
			case FHIRPackage.PRACTITIONER__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FHIRPackage.PRACTITIONER__GENDER:
				setGender((AdministrativeGender)newValue);
				return;
			case FHIRPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN:
				setDeceasedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME:
				setDeceasedDateTime((DateTime)newValue);
				return;
			case FHIRPackage.PRACTITIONER__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case FHIRPackage.PRACTITIONER__PHOTO:
				getPhoto().clear();
				getPhoto().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FHIRPackage.PRACTITIONER__QUALIFICATION:
				getQualification().clear();
				getQualification().addAll((Collection<? extends PractitionerQualification>)newValue);
				return;
			case FHIRPackage.PRACTITIONER__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends PractitionerCommunication>)newValue);
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
			case FHIRPackage.PRACTITIONER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.PRACTITIONER__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.PRACTITIONER__NAME:
				getName().clear();
				return;
			case FHIRPackage.PRACTITIONER__TELECOM:
				getTelecom().clear();
				return;
			case FHIRPackage.PRACTITIONER__GENDER:
				setGender((AdministrativeGender)null);
				return;
			case FHIRPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN:
				setDeceasedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME:
				setDeceasedDateTime((DateTime)null);
				return;
			case FHIRPackage.PRACTITIONER__ADDRESS:
				getAddress().clear();
				return;
			case FHIRPackage.PRACTITIONER__PHOTO:
				getPhoto().clear();
				return;
			case FHIRPackage.PRACTITIONER__QUALIFICATION:
				getQualification().clear();
				return;
			case FHIRPackage.PRACTITIONER__COMMUNICATION:
				getCommunication().clear();
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
			case FHIRPackage.PRACTITIONER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.PRACTITIONER__ACTIVE:
				return active != null;
			case FHIRPackage.PRACTITIONER__NAME:
				return name != null && !name.isEmpty();
			case FHIRPackage.PRACTITIONER__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FHIRPackage.PRACTITIONER__GENDER:
				return gender != null;
			case FHIRPackage.PRACTITIONER__BIRTH_DATE:
				return birthDate != null;
			case FHIRPackage.PRACTITIONER__DECEASED_BOOLEAN:
				return deceasedBoolean != null;
			case FHIRPackage.PRACTITIONER__DECEASED_DATE_TIME:
				return deceasedDateTime != null;
			case FHIRPackage.PRACTITIONER__ADDRESS:
				return address != null && !address.isEmpty();
			case FHIRPackage.PRACTITIONER__PHOTO:
				return photo != null && !photo.isEmpty();
			case FHIRPackage.PRACTITIONER__QUALIFICATION:
				return qualification != null && !qualification.isEmpty();
			case FHIRPackage.PRACTITIONER__COMMUNICATION:
				return communication != null && !communication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerImpl
