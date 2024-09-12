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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationPerformer;
import org.hl7.fhir.ImmunizationProgramEligibility;
import org.hl7.fhir.ImmunizationProtocolApplied;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationStatusCodes;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getAdministeredProduct <em>Administered Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getOccurrenceString <em>Occurrence String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getIsSubpotent <em>Is Subpotent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getSubpotentReason <em>Subpotent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getProgramEligibility <em>Program Eligibility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getReaction <em>Reaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getProtocolApplied <em>Protocol Applied</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationImpl extends DomainResourceImpl implements Immunization {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationStatusCodes status;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

	/**
	 * The cached value of the '{@link #getVaccineCode() <em>Vaccine Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept vaccineCode;

	/**
	 * The cached value of the '{@link #getAdministeredProduct() <em>Administered Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministeredProduct()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference administeredProduct;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference manufacturer;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrenceString() <em>Occurrence String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String occurrenceString;

	/**
	 * The cached value of the '{@link #getPrimarySource() <em>Primary Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySource()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean primarySource;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference informationSource;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity doseQuantity;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationPerformer> performer;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> reason;

	/**
	 * The cached value of the '{@link #getIsSubpotent() <em>Is Subpotent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubpotent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isSubpotent;

	/**
	 * The cached value of the '{@link #getSubpotentReason() <em>Subpotent Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpotentReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subpotentReason;

	/**
	 * The cached value of the '{@link #getProgramEligibility() <em>Program Eligibility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramEligibility()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationProgramEligibility> programEligibility;

	/**
	 * The cached value of the '{@link #getFundingSource() <em>Funding Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingSource()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fundingSource;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationReaction> reaction;

	/**
	 * The cached value of the '{@link #getProtocolApplied() <em>Protocol Applied</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolApplied()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationProtocolApplied> protocolApplied;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getImmunization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.IMMUNIZATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.IMMUNIZATION__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ImmunizationStatusCodes newStatus, NotificationChain msgs) {
		ImmunizationStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__STATUS, oldStatus, newStatus);
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
	public void setStatus(ImmunizationStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__STATUS_REASON, oldStatusReason, newStatusReason);
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
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getVaccineCode() {
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVaccineCode(CodeableConcept newVaccineCode, NotificationChain msgs) {
		CodeableConcept oldVaccineCode = vaccineCode;
		vaccineCode = newVaccineCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__VACCINE_CODE, oldVaccineCode, newVaccineCode);
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
	public void setVaccineCode(CodeableConcept newVaccineCode) {
		if (newVaccineCode != vaccineCode) {
			NotificationChain msgs = null;
			if (vaccineCode != null)
				msgs = ((InternalEObject)vaccineCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__VACCINE_CODE, null, msgs);
			if (newVaccineCode != null)
				msgs = ((InternalEObject)newVaccineCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__VACCINE_CODE, null, msgs);
			msgs = basicSetVaccineCode(newVaccineCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__VACCINE_CODE, newVaccineCode, newVaccineCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getAdministeredProduct() {
		return administeredProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministeredProduct(CodeableReference newAdministeredProduct, NotificationChain msgs) {
		CodeableReference oldAdministeredProduct = administeredProduct;
		administeredProduct = newAdministeredProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT, oldAdministeredProduct, newAdministeredProduct);
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
	public void setAdministeredProduct(CodeableReference newAdministeredProduct) {
		if (newAdministeredProduct != administeredProduct) {
			NotificationChain msgs = null;
			if (administeredProduct != null)
				msgs = ((InternalEObject)administeredProduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT, null, msgs);
			if (newAdministeredProduct != null)
				msgs = ((InternalEObject)newAdministeredProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT, null, msgs);
			msgs = basicSetAdministeredProduct(newAdministeredProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT, newAdministeredProduct, newAdministeredProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(CodeableReference newManufacturer, NotificationChain msgs) {
		CodeableReference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__MANUFACTURER, oldManufacturer, newManufacturer);
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
	public void setManufacturer(CodeableReference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(org.hl7.fhir.String newLotNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__LOT_NUMBER, oldLotNumber, newLotNumber);
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
	public void setLotNumber(org.hl7.fhir.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(Date newExpirationDate, NotificationChain msgs) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
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
	public void setExpirationDate(Date newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.IMMUNIZATION__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
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
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getOccurrenceString() {
		return occurrenceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceString(org.hl7.fhir.String newOccurrenceString, NotificationChain msgs) {
		org.hl7.fhir.String oldOccurrenceString = occurrenceString;
		occurrenceString = newOccurrenceString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING, oldOccurrenceString, newOccurrenceString);
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
	public void setOccurrenceString(org.hl7.fhir.String newOccurrenceString) {
		if (newOccurrenceString != occurrenceString) {
			NotificationChain msgs = null;
			if (occurrenceString != null)
				msgs = ((InternalEObject)occurrenceString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING, null, msgs);
			if (newOccurrenceString != null)
				msgs = ((InternalEObject)newOccurrenceString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING, null, msgs);
			msgs = basicSetOccurrenceString(newOccurrenceString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING, newOccurrenceString, newOccurrenceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getPrimarySource() {
		return primarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimarySource(org.hl7.fhir.Boolean newPrimarySource, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPrimarySource = primarySource;
		primarySource = newPrimarySource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE, oldPrimarySource, newPrimarySource);
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
	public void setPrimarySource(org.hl7.fhir.Boolean newPrimarySource) {
		if (newPrimarySource != primarySource) {
			NotificationChain msgs = null;
			if (primarySource != null)
				msgs = ((InternalEObject)primarySource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE, null, msgs);
			if (newPrimarySource != null)
				msgs = ((InternalEObject)newPrimarySource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE, null, msgs);
			msgs = basicSetPrimarySource(newPrimarySource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE, newPrimarySource, newPrimarySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getInformationSource() {
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationSource(CodeableReference newInformationSource, NotificationChain msgs) {
		CodeableReference oldInformationSource = informationSource;
		informationSource = newInformationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE, oldInformationSource, newInformationSource);
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
	public void setInformationSource(CodeableReference newInformationSource) {
		if (newInformationSource != informationSource) {
			NotificationChain msgs = null;
			if (informationSource != null)
				msgs = ((InternalEObject)informationSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE, null, msgs);
			if (newInformationSource != null)
				msgs = ((InternalEObject)newInformationSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE, null, msgs);
			msgs = basicSetInformationSource(newInformationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE, newInformationSource, newInformationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(CodeableConcept newSite, NotificationChain msgs) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__SITE, oldSite, newSite);
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
	public void setSite(CodeableConcept newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__ROUTE, oldRoute, newRoute);
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
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(Quantity newDoseQuantity, NotificationChain msgs) {
		Quantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
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
	public void setDoseQuantity(Quantity newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmunizationPerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ImmunizationPerformer>(ImmunizationPerformer.class, this, FHIRPackage.IMMUNIZATION__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.IMMUNIZATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.IMMUNIZATION__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getIsSubpotent() {
		return isSubpotent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSubpotent(org.hl7.fhir.Boolean newIsSubpotent, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsSubpotent = isSubpotent;
		isSubpotent = newIsSubpotent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__IS_SUBPOTENT, oldIsSubpotent, newIsSubpotent);
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
	public void setIsSubpotent(org.hl7.fhir.Boolean newIsSubpotent) {
		if (newIsSubpotent != isSubpotent) {
			NotificationChain msgs = null;
			if (isSubpotent != null)
				msgs = ((InternalEObject)isSubpotent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__IS_SUBPOTENT, null, msgs);
			if (newIsSubpotent != null)
				msgs = ((InternalEObject)newIsSubpotent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__IS_SUBPOTENT, null, msgs);
			msgs = basicSetIsSubpotent(newIsSubpotent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__IS_SUBPOTENT, newIsSubpotent, newIsSubpotent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubpotentReason() {
		if (subpotentReason == null) {
			subpotentReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.IMMUNIZATION__SUBPOTENT_REASON);
		}
		return subpotentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmunizationProgramEligibility> getProgramEligibility() {
		if (programEligibility == null) {
			programEligibility = new EObjectContainmentEList<ImmunizationProgramEligibility>(ImmunizationProgramEligibility.class, this, FHIRPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY);
		}
		return programEligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFundingSource() {
		return fundingSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundingSource(CodeableConcept newFundingSource, NotificationChain msgs) {
		CodeableConcept oldFundingSource = fundingSource;
		fundingSource = newFundingSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__FUNDING_SOURCE, oldFundingSource, newFundingSource);
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
	public void setFundingSource(CodeableConcept newFundingSource) {
		if (newFundingSource != fundingSource) {
			NotificationChain msgs = null;
			if (fundingSource != null)
				msgs = ((InternalEObject)fundingSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__FUNDING_SOURCE, null, msgs);
			if (newFundingSource != null)
				msgs = ((InternalEObject)newFundingSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMMUNIZATION__FUNDING_SOURCE, null, msgs);
			msgs = basicSetFundingSource(newFundingSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMMUNIZATION__FUNDING_SOURCE, newFundingSource, newFundingSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmunizationReaction> getReaction() {
		if (reaction == null) {
			reaction = new EObjectContainmentEList<ImmunizationReaction>(ImmunizationReaction.class, this, FHIRPackage.IMMUNIZATION__REACTION);
		}
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmunizationProtocolApplied> getProtocolApplied() {
		if (protocolApplied == null) {
			protocolApplied = new EObjectContainmentEList<ImmunizationProtocolApplied>(ImmunizationProtocolApplied.class, this, FHIRPackage.IMMUNIZATION__PROTOCOL_APPLIED);
		}
		return protocolApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.IMMUNIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.IMMUNIZATION__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case FHIRPackage.IMMUNIZATION__VACCINE_CODE:
				return basicSetVaccineCode(null, msgs);
			case FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT:
				return basicSetAdministeredProduct(null, msgs);
			case FHIRPackage.IMMUNIZATION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FHIRPackage.IMMUNIZATION__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FHIRPackage.IMMUNIZATION__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case FHIRPackage.IMMUNIZATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FHIRPackage.IMMUNIZATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FHIRPackage.IMMUNIZATION__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING:
				return basicSetOccurrenceString(null, msgs);
			case FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return basicSetPrimarySource(null, msgs);
			case FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE:
				return basicSetInformationSource(null, msgs);
			case FHIRPackage.IMMUNIZATION__LOCATION:
				return basicSetLocation(null, msgs);
			case FHIRPackage.IMMUNIZATION__SITE:
				return basicSetSite(null, msgs);
			case FHIRPackage.IMMUNIZATION__ROUTE:
				return basicSetRoute(null, msgs);
			case FHIRPackage.IMMUNIZATION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case FHIRPackage.IMMUNIZATION__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__IS_SUBPOTENT:
				return basicSetIsSubpotent(null, msgs);
			case FHIRPackage.IMMUNIZATION__SUBPOTENT_REASON:
				return ((InternalEList<?>)getSubpotentReason()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				return ((InternalEList<?>)getProgramEligibility()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__FUNDING_SOURCE:
				return basicSetFundingSource(null, msgs);
			case FHIRPackage.IMMUNIZATION__REACTION:
				return ((InternalEList<?>)getReaction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				return ((InternalEList<?>)getProtocolApplied()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.IMMUNIZATION__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.IMMUNIZATION__BASED_ON:
				return getBasedOn();
			case FHIRPackage.IMMUNIZATION__STATUS:
				return getStatus();
			case FHIRPackage.IMMUNIZATION__STATUS_REASON:
				return getStatusReason();
			case FHIRPackage.IMMUNIZATION__VACCINE_CODE:
				return getVaccineCode();
			case FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT:
				return getAdministeredProduct();
			case FHIRPackage.IMMUNIZATION__MANUFACTURER:
				return getManufacturer();
			case FHIRPackage.IMMUNIZATION__LOT_NUMBER:
				return getLotNumber();
			case FHIRPackage.IMMUNIZATION__EXPIRATION_DATE:
				return getExpirationDate();
			case FHIRPackage.IMMUNIZATION__PATIENT:
				return getPatient();
			case FHIRPackage.IMMUNIZATION__ENCOUNTER:
				return getEncounter();
			case FHIRPackage.IMMUNIZATION__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING:
				return getOccurrenceString();
			case FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return getPrimarySource();
			case FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE:
				return getInformationSource();
			case FHIRPackage.IMMUNIZATION__LOCATION:
				return getLocation();
			case FHIRPackage.IMMUNIZATION__SITE:
				return getSite();
			case FHIRPackage.IMMUNIZATION__ROUTE:
				return getRoute();
			case FHIRPackage.IMMUNIZATION__DOSE_QUANTITY:
				return getDoseQuantity();
			case FHIRPackage.IMMUNIZATION__PERFORMER:
				return getPerformer();
			case FHIRPackage.IMMUNIZATION__NOTE:
				return getNote();
			case FHIRPackage.IMMUNIZATION__REASON:
				return getReason();
			case FHIRPackage.IMMUNIZATION__IS_SUBPOTENT:
				return getIsSubpotent();
			case FHIRPackage.IMMUNIZATION__SUBPOTENT_REASON:
				return getSubpotentReason();
			case FHIRPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				return getProgramEligibility();
			case FHIRPackage.IMMUNIZATION__FUNDING_SOURCE:
				return getFundingSource();
			case FHIRPackage.IMMUNIZATION__REACTION:
				return getReaction();
			case FHIRPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				return getProtocolApplied();
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
			case FHIRPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__STATUS:
				setStatus((ImmunizationStatusCodes)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT:
				setAdministeredProduct((CodeableReference)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((CodeableReference)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING:
				setOccurrenceString((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE:
				setInformationSource((CodeableReference)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ImmunizationPerformer>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__IS_SUBPOTENT:
				setIsSubpotent((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__SUBPOTENT_REASON:
				getSubpotentReason().clear();
				getSubpotentReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				getProgramEligibility().clear();
				getProgramEligibility().addAll((Collection<? extends ImmunizationProgramEligibility>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__FUNDING_SOURCE:
				setFundingSource((CodeableConcept)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__REACTION:
				getReaction().clear();
				getReaction().addAll((Collection<? extends ImmunizationReaction>)newValue);
				return;
			case FHIRPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				getProtocolApplied().clear();
				getProtocolApplied().addAll((Collection<? extends ImmunizationProtocolApplied>)newValue);
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
			case FHIRPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.IMMUNIZATION__BASED_ON:
				getBasedOn().clear();
				return;
			case FHIRPackage.IMMUNIZATION__STATUS:
				setStatus((ImmunizationStatusCodes)null);
				return;
			case FHIRPackage.IMMUNIZATION__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case FHIRPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)null);
				return;
			case FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT:
				setAdministeredProduct((CodeableReference)null);
				return;
			case FHIRPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((CodeableReference)null);
				return;
			case FHIRPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)null);
				return;
			case FHIRPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FHIRPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FHIRPackage.IMMUNIZATION__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING:
				setOccurrenceString((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE:
				setInformationSource((CodeableReference)null);
				return;
			case FHIRPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)null);
				return;
			case FHIRPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)null);
				return;
			case FHIRPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FHIRPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)null);
				return;
			case FHIRPackage.IMMUNIZATION__PERFORMER:
				getPerformer().clear();
				return;
			case FHIRPackage.IMMUNIZATION__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.IMMUNIZATION__REASON:
				getReason().clear();
				return;
			case FHIRPackage.IMMUNIZATION__IS_SUBPOTENT:
				setIsSubpotent((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.IMMUNIZATION__SUBPOTENT_REASON:
				getSubpotentReason().clear();
				return;
			case FHIRPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				getProgramEligibility().clear();
				return;
			case FHIRPackage.IMMUNIZATION__FUNDING_SOURCE:
				setFundingSource((CodeableConcept)null);
				return;
			case FHIRPackage.IMMUNIZATION__REACTION:
				getReaction().clear();
				return;
			case FHIRPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				getProtocolApplied().clear();
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
			case FHIRPackage.IMMUNIZATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.IMMUNIZATION__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FHIRPackage.IMMUNIZATION__STATUS:
				return status != null;
			case FHIRPackage.IMMUNIZATION__STATUS_REASON:
				return statusReason != null;
			case FHIRPackage.IMMUNIZATION__VACCINE_CODE:
				return vaccineCode != null;
			case FHIRPackage.IMMUNIZATION__ADMINISTERED_PRODUCT:
				return administeredProduct != null;
			case FHIRPackage.IMMUNIZATION__MANUFACTURER:
				return manufacturer != null;
			case FHIRPackage.IMMUNIZATION__LOT_NUMBER:
				return lotNumber != null;
			case FHIRPackage.IMMUNIZATION__EXPIRATION_DATE:
				return expirationDate != null;
			case FHIRPackage.IMMUNIZATION__PATIENT:
				return patient != null;
			case FHIRPackage.IMMUNIZATION__ENCOUNTER:
				return encounter != null;
			case FHIRPackage.IMMUNIZATION__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FHIRPackage.IMMUNIZATION__OCCURRENCE_STRING:
				return occurrenceString != null;
			case FHIRPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return primarySource != null;
			case FHIRPackage.IMMUNIZATION__INFORMATION_SOURCE:
				return informationSource != null;
			case FHIRPackage.IMMUNIZATION__LOCATION:
				return location != null;
			case FHIRPackage.IMMUNIZATION__SITE:
				return site != null;
			case FHIRPackage.IMMUNIZATION__ROUTE:
				return route != null;
			case FHIRPackage.IMMUNIZATION__DOSE_QUANTITY:
				return doseQuantity != null;
			case FHIRPackage.IMMUNIZATION__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FHIRPackage.IMMUNIZATION__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.IMMUNIZATION__REASON:
				return reason != null && !reason.isEmpty();
			case FHIRPackage.IMMUNIZATION__IS_SUBPOTENT:
				return isSubpotent != null;
			case FHIRPackage.IMMUNIZATION__SUBPOTENT_REASON:
				return subpotentReason != null && !subpotentReason.isEmpty();
			case FHIRPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				return programEligibility != null && !programEligibility.isEmpty();
			case FHIRPackage.IMMUNIZATION__FUNDING_SOURCE:
				return fundingSource != null;
			case FHIRPackage.IMMUNIZATION__REACTION:
				return reaction != null && !reaction.isEmpty();
			case FHIRPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				return protocolApplied != null && !protocolApplied.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationImpl
