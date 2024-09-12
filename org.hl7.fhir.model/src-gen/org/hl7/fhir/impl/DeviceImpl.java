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
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Count;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceConformsTo;
import org.hl7.fhir.DeviceName;
import org.hl7.fhir.DeviceProperty;
import org.hl7.fhir.DeviceUdiCarrier;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getUdiCarrier <em>Udi Carrier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getBiologicalSourceEvent <em>Biological Source Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends DomainResourceImpl implements Device {
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
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String displayName;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference definition;

	/**
	 * The cached value of the '{@link #getUdiCarrier() <em>Udi Carrier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiCarrier()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceUdiCarrier> udiCarrier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FHIRDeviceStatus status;

	/**
	 * The cached value of the '{@link #getAvailabilityStatus() <em>Availability Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept availabilityStatus;

	/**
	 * The cached value of the '{@link #getBiologicalSourceEvent() <em>Biological Source Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicalSourceEvent()
	 * @generated
	 * @ordered
	 */
	protected Identifier biologicalSourceEvent;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String manufacturer;

	/**
	 * The cached value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime manufactureDate;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime expirationDate;

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
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String serialNumber;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceName> name;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String modelNumber;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String partNumber;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceVersion> version;

	/**
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceConformsTo> conformsTo;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceProperty> property;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept mode;

	/**
	 * The cached value of the '{@link #getCycle() <em>Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected Count cycle;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contact;

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
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> gateway;

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
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> safety;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Reference parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FHIRPackage.DEVICE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(org.hl7.fhir.String newDisplayName, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__DISPLAY_NAME, oldDisplayName, newDisplayName);
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
	public void setDisplayName(org.hl7.fhir.String newDisplayName) {
		if (newDisplayName != displayName) {
			NotificationChain msgs = null;
			if (displayName != null)
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__DISPLAY_NAME, newDisplayName, newDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(CodeableReference newDefinition, NotificationChain msgs) {
		CodeableReference oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__DEFINITION, oldDefinition, newDefinition);
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
	public void setDefinition(CodeableReference newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceUdiCarrier> getUdiCarrier() {
		if (udiCarrier == null) {
			udiCarrier = new EObjectContainmentEList<DeviceUdiCarrier>(DeviceUdiCarrier.class, this, FHIRPackage.DEVICE__UDI_CARRIER);
		}
		return udiCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FHIRDeviceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FHIRDeviceStatus newStatus, NotificationChain msgs) {
		FHIRDeviceStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__STATUS, oldStatus, newStatus);
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
	public void setStatus(FHIRDeviceStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAvailabilityStatus() {
		return availabilityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityStatus(CodeableConcept newAvailabilityStatus, NotificationChain msgs) {
		CodeableConcept oldAvailabilityStatus = availabilityStatus;
		availabilityStatus = newAvailabilityStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__AVAILABILITY_STATUS, oldAvailabilityStatus, newAvailabilityStatus);
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
	public void setAvailabilityStatus(CodeableConcept newAvailabilityStatus) {
		if (newAvailabilityStatus != availabilityStatus) {
			NotificationChain msgs = null;
			if (availabilityStatus != null)
				msgs = ((InternalEObject)availabilityStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__AVAILABILITY_STATUS, null, msgs);
			if (newAvailabilityStatus != null)
				msgs = ((InternalEObject)newAvailabilityStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__AVAILABILITY_STATUS, null, msgs);
			msgs = basicSetAvailabilityStatus(newAvailabilityStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__AVAILABILITY_STATUS, newAvailabilityStatus, newAvailabilityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getBiologicalSourceEvent() {
		return biologicalSourceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiologicalSourceEvent(Identifier newBiologicalSourceEvent, NotificationChain msgs) {
		Identifier oldBiologicalSourceEvent = biologicalSourceEvent;
		biologicalSourceEvent = newBiologicalSourceEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT, oldBiologicalSourceEvent, newBiologicalSourceEvent);
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
	public void setBiologicalSourceEvent(Identifier newBiologicalSourceEvent) {
		if (newBiologicalSourceEvent != biologicalSourceEvent) {
			NotificationChain msgs = null;
			if (biologicalSourceEvent != null)
				msgs = ((InternalEObject)biologicalSourceEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT, null, msgs);
			if (newBiologicalSourceEvent != null)
				msgs = ((InternalEObject)newBiologicalSourceEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT, null, msgs);
			msgs = basicSetBiologicalSourceEvent(newBiologicalSourceEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT, newBiologicalSourceEvent, newBiologicalSourceEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(org.hl7.fhir.String newManufacturer, NotificationChain msgs) {
		org.hl7.fhir.String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MANUFACTURER, oldManufacturer, newManufacturer);
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
	public void setManufacturer(org.hl7.fhir.String newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufactureDate(DateTime newManufactureDate, NotificationChain msgs) {
		DateTime oldManufactureDate = manufactureDate;
		manufactureDate = newManufactureDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MANUFACTURE_DATE, oldManufactureDate, newManufactureDate);
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
	public void setManufactureDate(DateTime newManufactureDate) {
		if (newManufactureDate != manufactureDate) {
			NotificationChain msgs = null;
			if (manufactureDate != null)
				msgs = ((InternalEObject)manufactureDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MANUFACTURE_DATE, null, msgs);
			if (newManufactureDate != null)
				msgs = ((InternalEObject)newManufactureDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MANUFACTURE_DATE, null, msgs);
			msgs = basicSetManufactureDate(newManufactureDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MANUFACTURE_DATE, newManufactureDate, newManufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(DateTime newExpirationDate, NotificationChain msgs) {
		DateTime oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
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
	public void setExpirationDate(DateTime newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__LOT_NUMBER, oldLotNumber, newLotNumber);
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
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerialNumber(org.hl7.fhir.String newSerialNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__SERIAL_NUMBER, oldSerialNumber, newSerialNumber);
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
	public void setSerialNumber(org.hl7.fhir.String newSerialNumber) {
		if (newSerialNumber != serialNumber) {
			NotificationChain msgs = null;
			if (serialNumber != null)
				msgs = ((InternalEObject)serialNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__SERIAL_NUMBER, null, msgs);
			if (newSerialNumber != null)
				msgs = ((InternalEObject)newSerialNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__SERIAL_NUMBER, null, msgs);
			msgs = basicSetSerialNumber(newSerialNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__SERIAL_NUMBER, newSerialNumber, newSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<DeviceName>(DeviceName.class, this, FHIRPackage.DEVICE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelNumber(org.hl7.fhir.String newModelNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MODEL_NUMBER, oldModelNumber, newModelNumber);
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
	public void setModelNumber(org.hl7.fhir.String newModelNumber) {
		if (newModelNumber != modelNumber) {
			NotificationChain msgs = null;
			if (modelNumber != null)
				msgs = ((InternalEObject)modelNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MODEL_NUMBER, null, msgs);
			if (newModelNumber != null)
				msgs = ((InternalEObject)newModelNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MODEL_NUMBER, null, msgs);
			msgs = basicSetModelNumber(newModelNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MODEL_NUMBER, newModelNumber, newModelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartNumber(org.hl7.fhir.String newPartNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__PART_NUMBER, oldPartNumber, newPartNumber);
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
	public void setPartNumber(org.hl7.fhir.String newPartNumber) {
		if (newPartNumber != partNumber) {
			NotificationChain msgs = null;
			if (partNumber != null)
				msgs = ((InternalEObject)partNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__PART_NUMBER, null, msgs);
			if (newPartNumber != null)
				msgs = ((InternalEObject)newPartNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__PART_NUMBER, null, msgs);
			msgs = basicSetPartNumber(newPartNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__PART_NUMBER, newPartNumber, newPartNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.DEVICE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.DEVICE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<DeviceVersion>(DeviceVersion.class, this, FHIRPackage.DEVICE__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceConformsTo> getConformsTo() {
		if (conformsTo == null) {
			conformsTo = new EObjectContainmentEList<DeviceConformsTo>(DeviceConformsTo.class, this, FHIRPackage.DEVICE__CONFORMS_TO);
		}
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<DeviceProperty>(DeviceProperty.class, this, FHIRPackage.DEVICE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(CodeableConcept newMode, NotificationChain msgs) {
		CodeableConcept oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MODE, oldMode, newMode);
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
	public void setMode(CodeableConcept newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getCycle() {
		return cycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCycle(Count newCycle, NotificationChain msgs) {
		Count oldCycle = cycle;
		cycle = newCycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__CYCLE, oldCycle, newCycle);
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
	public void setCycle(Count newCycle) {
		if (newCycle != cycle) {
			NotificationChain msgs = null;
			if (cycle != null)
				msgs = ((InternalEObject)cycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__CYCLE, null, msgs);
			if (newCycle != null)
				msgs = ((InternalEObject)newCycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__CYCLE, null, msgs);
			msgs = basicSetCycle(newCycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__CYCLE, newCycle, newCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Duration newDuration, NotificationChain msgs) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__DURATION, oldDuration, newDuration);
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
	public void setDuration(Duration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__OWNER, oldOwner, newOwner);
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
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FHIRPackage.DEVICE__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__URL, oldUrl, newUrl);
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
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FHIRPackage.DEVICE__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getGateway() {
		if (gateway == null) {
			gateway = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.DEVICE__GATEWAY);
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FHIRPackage.DEVICE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSafety() {
		if (safety == null) {
			safety = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.DEVICE__SAFETY);
		}
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Reference newParent, NotificationChain msgs) {
		Reference oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__PARENT, oldParent, newParent);
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
	public void setParent(Reference newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.DEVICE__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.DEVICE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.DEVICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case FHIRPackage.DEVICE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FHIRPackage.DEVICE__UDI_CARRIER:
				return ((InternalEList<?>)getUdiCarrier()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__STATUS:
				return basicSetStatus(null, msgs);
			case FHIRPackage.DEVICE__AVAILABILITY_STATUS:
				return basicSetAvailabilityStatus(null, msgs);
			case FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT:
				return basicSetBiologicalSourceEvent(null, msgs);
			case FHIRPackage.DEVICE__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FHIRPackage.DEVICE__MANUFACTURE_DATE:
				return basicSetManufactureDate(null, msgs);
			case FHIRPackage.DEVICE__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case FHIRPackage.DEVICE__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FHIRPackage.DEVICE__SERIAL_NUMBER:
				return basicSetSerialNumber(null, msgs);
			case FHIRPackage.DEVICE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__MODEL_NUMBER:
				return basicSetModelNumber(null, msgs);
			case FHIRPackage.DEVICE__PART_NUMBER:
				return basicSetPartNumber(null, msgs);
			case FHIRPackage.DEVICE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__CONFORMS_TO:
				return ((InternalEList<?>)getConformsTo()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__MODE:
				return basicSetMode(null, msgs);
			case FHIRPackage.DEVICE__CYCLE:
				return basicSetCycle(null, msgs);
			case FHIRPackage.DEVICE__DURATION:
				return basicSetDuration(null, msgs);
			case FHIRPackage.DEVICE__OWNER:
				return basicSetOwner(null, msgs);
			case FHIRPackage.DEVICE__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__LOCATION:
				return basicSetLocation(null, msgs);
			case FHIRPackage.DEVICE__URL:
				return basicSetUrl(null, msgs);
			case FHIRPackage.DEVICE__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__GATEWAY:
				return ((InternalEList<?>)getGateway()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__SAFETY:
				return ((InternalEList<?>)getSafety()).basicRemove(otherEnd, msgs);
			case FHIRPackage.DEVICE__PARENT:
				return basicSetParent(null, msgs);
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
			case FHIRPackage.DEVICE__IDENTIFIER:
				return getIdentifier();
			case FHIRPackage.DEVICE__DISPLAY_NAME:
				return getDisplayName();
			case FHIRPackage.DEVICE__DEFINITION:
				return getDefinition();
			case FHIRPackage.DEVICE__UDI_CARRIER:
				return getUdiCarrier();
			case FHIRPackage.DEVICE__STATUS:
				return getStatus();
			case FHIRPackage.DEVICE__AVAILABILITY_STATUS:
				return getAvailabilityStatus();
			case FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT:
				return getBiologicalSourceEvent();
			case FHIRPackage.DEVICE__MANUFACTURER:
				return getManufacturer();
			case FHIRPackage.DEVICE__MANUFACTURE_DATE:
				return getManufactureDate();
			case FHIRPackage.DEVICE__EXPIRATION_DATE:
				return getExpirationDate();
			case FHIRPackage.DEVICE__LOT_NUMBER:
				return getLotNumber();
			case FHIRPackage.DEVICE__SERIAL_NUMBER:
				return getSerialNumber();
			case FHIRPackage.DEVICE__NAME:
				return getName();
			case FHIRPackage.DEVICE__MODEL_NUMBER:
				return getModelNumber();
			case FHIRPackage.DEVICE__PART_NUMBER:
				return getPartNumber();
			case FHIRPackage.DEVICE__CATEGORY:
				return getCategory();
			case FHIRPackage.DEVICE__TYPE:
				return getType();
			case FHIRPackage.DEVICE__VERSION:
				return getVersion();
			case FHIRPackage.DEVICE__CONFORMS_TO:
				return getConformsTo();
			case FHIRPackage.DEVICE__PROPERTY:
				return getProperty();
			case FHIRPackage.DEVICE__MODE:
				return getMode();
			case FHIRPackage.DEVICE__CYCLE:
				return getCycle();
			case FHIRPackage.DEVICE__DURATION:
				return getDuration();
			case FHIRPackage.DEVICE__OWNER:
				return getOwner();
			case FHIRPackage.DEVICE__CONTACT:
				return getContact();
			case FHIRPackage.DEVICE__LOCATION:
				return getLocation();
			case FHIRPackage.DEVICE__URL:
				return getUrl();
			case FHIRPackage.DEVICE__ENDPOINT:
				return getEndpoint();
			case FHIRPackage.DEVICE__GATEWAY:
				return getGateway();
			case FHIRPackage.DEVICE__NOTE:
				return getNote();
			case FHIRPackage.DEVICE__SAFETY:
				return getSafety();
			case FHIRPackage.DEVICE__PARENT:
				return getParent();
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
			case FHIRPackage.DEVICE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FHIRPackage.DEVICE__DISPLAY_NAME:
				setDisplayName((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DEVICE__DEFINITION:
				setDefinition((CodeableReference)newValue);
				return;
			case FHIRPackage.DEVICE__UDI_CARRIER:
				getUdiCarrier().clear();
				getUdiCarrier().addAll((Collection<? extends DeviceUdiCarrier>)newValue);
				return;
			case FHIRPackage.DEVICE__STATUS:
				setStatus((FHIRDeviceStatus)newValue);
				return;
			case FHIRPackage.DEVICE__AVAILABILITY_STATUS:
				setAvailabilityStatus((CodeableConcept)newValue);
				return;
			case FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT:
				setBiologicalSourceEvent((Identifier)newValue);
				return;
			case FHIRPackage.DEVICE__MANUFACTURER:
				setManufacturer((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)newValue);
				return;
			case FHIRPackage.DEVICE__EXPIRATION_DATE:
				setExpirationDate((DateTime)newValue);
				return;
			case FHIRPackage.DEVICE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DEVICE__SERIAL_NUMBER:
				setSerialNumber((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DEVICE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends DeviceName>)newValue);
				return;
			case FHIRPackage.DEVICE__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DEVICE__PART_NUMBER:
				setPartNumber((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.DEVICE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.DEVICE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.DEVICE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends DeviceVersion>)newValue);
				return;
			case FHIRPackage.DEVICE__CONFORMS_TO:
				getConformsTo().clear();
				getConformsTo().addAll((Collection<? extends DeviceConformsTo>)newValue);
				return;
			case FHIRPackage.DEVICE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends DeviceProperty>)newValue);
				return;
			case FHIRPackage.DEVICE__MODE:
				setMode((CodeableConcept)newValue);
				return;
			case FHIRPackage.DEVICE__CYCLE:
				setCycle((Count)newValue);
				return;
			case FHIRPackage.DEVICE__DURATION:
				setDuration((Duration)newValue);
				return;
			case FHIRPackage.DEVICE__OWNER:
				setOwner((Reference)newValue);
				return;
			case FHIRPackage.DEVICE__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FHIRPackage.DEVICE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FHIRPackage.DEVICE__URL:
				setUrl((Uri)newValue);
				return;
			case FHIRPackage.DEVICE__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
				return;
			case FHIRPackage.DEVICE__GATEWAY:
				getGateway().clear();
				getGateway().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.DEVICE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FHIRPackage.DEVICE__SAFETY:
				getSafety().clear();
				getSafety().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.DEVICE__PARENT:
				setParent((Reference)newValue);
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
			case FHIRPackage.DEVICE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FHIRPackage.DEVICE__DISPLAY_NAME:
				setDisplayName((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DEVICE__DEFINITION:
				setDefinition((CodeableReference)null);
				return;
			case FHIRPackage.DEVICE__UDI_CARRIER:
				getUdiCarrier().clear();
				return;
			case FHIRPackage.DEVICE__STATUS:
				setStatus((FHIRDeviceStatus)null);
				return;
			case FHIRPackage.DEVICE__AVAILABILITY_STATUS:
				setAvailabilityStatus((CodeableConcept)null);
				return;
			case FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT:
				setBiologicalSourceEvent((Identifier)null);
				return;
			case FHIRPackage.DEVICE__MANUFACTURER:
				setManufacturer((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)null);
				return;
			case FHIRPackage.DEVICE__EXPIRATION_DATE:
				setExpirationDate((DateTime)null);
				return;
			case FHIRPackage.DEVICE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DEVICE__SERIAL_NUMBER:
				setSerialNumber((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DEVICE__NAME:
				getName().clear();
				return;
			case FHIRPackage.DEVICE__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DEVICE__PART_NUMBER:
				setPartNumber((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.DEVICE__CATEGORY:
				getCategory().clear();
				return;
			case FHIRPackage.DEVICE__TYPE:
				getType().clear();
				return;
			case FHIRPackage.DEVICE__VERSION:
				getVersion().clear();
				return;
			case FHIRPackage.DEVICE__CONFORMS_TO:
				getConformsTo().clear();
				return;
			case FHIRPackage.DEVICE__PROPERTY:
				getProperty().clear();
				return;
			case FHIRPackage.DEVICE__MODE:
				setMode((CodeableConcept)null);
				return;
			case FHIRPackage.DEVICE__CYCLE:
				setCycle((Count)null);
				return;
			case FHIRPackage.DEVICE__DURATION:
				setDuration((Duration)null);
				return;
			case FHIRPackage.DEVICE__OWNER:
				setOwner((Reference)null);
				return;
			case FHIRPackage.DEVICE__CONTACT:
				getContact().clear();
				return;
			case FHIRPackage.DEVICE__LOCATION:
				setLocation((Reference)null);
				return;
			case FHIRPackage.DEVICE__URL:
				setUrl((Uri)null);
				return;
			case FHIRPackage.DEVICE__ENDPOINT:
				getEndpoint().clear();
				return;
			case FHIRPackage.DEVICE__GATEWAY:
				getGateway().clear();
				return;
			case FHIRPackage.DEVICE__NOTE:
				getNote().clear();
				return;
			case FHIRPackage.DEVICE__SAFETY:
				getSafety().clear();
				return;
			case FHIRPackage.DEVICE__PARENT:
				setParent((Reference)null);
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
			case FHIRPackage.DEVICE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FHIRPackage.DEVICE__DISPLAY_NAME:
				return displayName != null;
			case FHIRPackage.DEVICE__DEFINITION:
				return definition != null;
			case FHIRPackage.DEVICE__UDI_CARRIER:
				return udiCarrier != null && !udiCarrier.isEmpty();
			case FHIRPackage.DEVICE__STATUS:
				return status != null;
			case FHIRPackage.DEVICE__AVAILABILITY_STATUS:
				return availabilityStatus != null;
			case FHIRPackage.DEVICE__BIOLOGICAL_SOURCE_EVENT:
				return biologicalSourceEvent != null;
			case FHIRPackage.DEVICE__MANUFACTURER:
				return manufacturer != null;
			case FHIRPackage.DEVICE__MANUFACTURE_DATE:
				return manufactureDate != null;
			case FHIRPackage.DEVICE__EXPIRATION_DATE:
				return expirationDate != null;
			case FHIRPackage.DEVICE__LOT_NUMBER:
				return lotNumber != null;
			case FHIRPackage.DEVICE__SERIAL_NUMBER:
				return serialNumber != null;
			case FHIRPackage.DEVICE__NAME:
				return name != null && !name.isEmpty();
			case FHIRPackage.DEVICE__MODEL_NUMBER:
				return modelNumber != null;
			case FHIRPackage.DEVICE__PART_NUMBER:
				return partNumber != null;
			case FHIRPackage.DEVICE__CATEGORY:
				return category != null && !category.isEmpty();
			case FHIRPackage.DEVICE__TYPE:
				return type != null && !type.isEmpty();
			case FHIRPackage.DEVICE__VERSION:
				return version != null && !version.isEmpty();
			case FHIRPackage.DEVICE__CONFORMS_TO:
				return conformsTo != null && !conformsTo.isEmpty();
			case FHIRPackage.DEVICE__PROPERTY:
				return property != null && !property.isEmpty();
			case FHIRPackage.DEVICE__MODE:
				return mode != null;
			case FHIRPackage.DEVICE__CYCLE:
				return cycle != null;
			case FHIRPackage.DEVICE__DURATION:
				return duration != null;
			case FHIRPackage.DEVICE__OWNER:
				return owner != null;
			case FHIRPackage.DEVICE__CONTACT:
				return contact != null && !contact.isEmpty();
			case FHIRPackage.DEVICE__LOCATION:
				return location != null;
			case FHIRPackage.DEVICE__URL:
				return url != null;
			case FHIRPackage.DEVICE__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FHIRPackage.DEVICE__GATEWAY:
				return gateway != null && !gateway.isEmpty();
			case FHIRPackage.DEVICE__NOTE:
				return note != null && !note.isEmpty();
			case FHIRPackage.DEVICE__SAFETY:
				return safety != null && !safety.isEmpty();
			case FHIRPackage.DEVICE__PARENT:
				return parent != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceImpl
