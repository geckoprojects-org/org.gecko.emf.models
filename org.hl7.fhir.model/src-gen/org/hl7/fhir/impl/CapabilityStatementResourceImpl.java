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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.ResourceVersionPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getSupportedProfile <em>Supported Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getConditionalRead <em>Conditional Read</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getConditionalPatch <em>Conditional Patch</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getReferencePolicy <em>Reference Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getSearchInclude <em>Search Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getSearchRevInclude <em>Search Rev Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementResourceImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementResourceImpl extends BackboneElementImpl implements CapabilityStatementResource {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType type;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Canonical profile;

	/**
	 * The cached value of the '{@link #getSupportedProfile() <em>Supported Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> supportedProfile;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementInteraction> interaction;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected ResourceVersionPolicy versioning;

	/**
	 * The cached value of the '{@link #getReadHistory() <em>Read History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHistory()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean readHistory;

	/**
	 * The cached value of the '{@link #getUpdateCreate() <em>Update Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCreate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean updateCreate;

	/**
	 * The cached value of the '{@link #getConditionalCreate() <em>Conditional Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalCreate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean conditionalCreate;

	/**
	 * The cached value of the '{@link #getConditionalRead() <em>Conditional Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalRead()
	 * @generated
	 * @ordered
	 */
	protected ConditionalReadStatus conditionalRead;

	/**
	 * The cached value of the '{@link #getConditionalUpdate() <em>Conditional Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalUpdate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean conditionalUpdate;

	/**
	 * The cached value of the '{@link #getConditionalPatch() <em>Conditional Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalPatch()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean conditionalPatch;

	/**
	 * The cached value of the '{@link #getConditionalDelete() <em>Conditional Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalDelete()
	 * @generated
	 * @ordered
	 */
	protected ConditionalDeleteStatus conditionalDelete;

	/**
	 * The cached value of the '{@link #getReferencePolicy() <em>Reference Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceHandlingPolicy> referencePolicy;

	/**
	 * The cached value of the '{@link #getSearchInclude() <em>Search Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> searchInclude;

	/**
	 * The cached value of the '{@link #getSearchRevInclude() <em>Search Rev Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchRevInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> searchRevInclude;

	/**
	 * The cached value of the '{@link #getSearchParam() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParam()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementSearchParam> searchParam;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementOperation> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getCapabilityStatementResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ResourceType newType, NotificationChain msgs) {
		ResourceType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE, oldType, newType);
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
	public void setType(ResourceType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Canonical newProfile, NotificationChain msgs) {
		Canonical oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE, oldProfile, newProfile);
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
	public void setProfile(Canonical newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getSupportedProfile() {
		if (supportedProfile == null) {
			supportedProfile = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SUPPORTED_PROFILE);
		}
		return supportedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementInteraction> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<CapabilityStatementInteraction>(CapabilityStatementInteraction.class, this, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceVersionPolicy getVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersioning(ResourceVersionPolicy newVersioning, NotificationChain msgs) {
		ResourceVersionPolicy oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING, oldVersioning, newVersioning);
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
	public void setVersioning(ResourceVersionPolicy newVersioning) {
		if (newVersioning != versioning) {
			NotificationChain msgs = null;
			if (versioning != null)
				msgs = ((InternalEObject)versioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING, null, msgs);
			if (newVersioning != null)
				msgs = ((InternalEObject)newVersioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING, null, msgs);
			msgs = basicSetVersioning(newVersioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING, newVersioning, newVersioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getReadHistory() {
		return readHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadHistory(org.hl7.fhir.Boolean newReadHistory, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReadHistory = readHistory;
		readHistory = newReadHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY, oldReadHistory, newReadHistory);
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
	public void setReadHistory(org.hl7.fhir.Boolean newReadHistory) {
		if (newReadHistory != readHistory) {
			NotificationChain msgs = null;
			if (readHistory != null)
				msgs = ((InternalEObject)readHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY, null, msgs);
			if (newReadHistory != null)
				msgs = ((InternalEObject)newReadHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY, null, msgs);
			msgs = basicSetReadHistory(newReadHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY, newReadHistory, newReadHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getUpdateCreate() {
		return updateCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateCreate(org.hl7.fhir.Boolean newUpdateCreate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldUpdateCreate = updateCreate;
		updateCreate = newUpdateCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE, oldUpdateCreate, newUpdateCreate);
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
	public void setUpdateCreate(org.hl7.fhir.Boolean newUpdateCreate) {
		if (newUpdateCreate != updateCreate) {
			NotificationChain msgs = null;
			if (updateCreate != null)
				msgs = ((InternalEObject)updateCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE, null, msgs);
			if (newUpdateCreate != null)
				msgs = ((InternalEObject)newUpdateCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE, null, msgs);
			msgs = basicSetUpdateCreate(newUpdateCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE, newUpdateCreate, newUpdateCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getConditionalCreate() {
		return conditionalCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalCreate(org.hl7.fhir.Boolean newConditionalCreate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldConditionalCreate = conditionalCreate;
		conditionalCreate = newConditionalCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE, oldConditionalCreate, newConditionalCreate);
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
	public void setConditionalCreate(org.hl7.fhir.Boolean newConditionalCreate) {
		if (newConditionalCreate != conditionalCreate) {
			NotificationChain msgs = null;
			if (conditionalCreate != null)
				msgs = ((InternalEObject)conditionalCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE, null, msgs);
			if (newConditionalCreate != null)
				msgs = ((InternalEObject)newConditionalCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE, null, msgs);
			msgs = basicSetConditionalCreate(newConditionalCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE, newConditionalCreate, newConditionalCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalReadStatus getConditionalRead() {
		return conditionalRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalRead(ConditionalReadStatus newConditionalRead, NotificationChain msgs) {
		ConditionalReadStatus oldConditionalRead = conditionalRead;
		conditionalRead = newConditionalRead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ, oldConditionalRead, newConditionalRead);
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
	public void setConditionalRead(ConditionalReadStatus newConditionalRead) {
		if (newConditionalRead != conditionalRead) {
			NotificationChain msgs = null;
			if (conditionalRead != null)
				msgs = ((InternalEObject)conditionalRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ, null, msgs);
			if (newConditionalRead != null)
				msgs = ((InternalEObject)newConditionalRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ, null, msgs);
			msgs = basicSetConditionalRead(newConditionalRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ, newConditionalRead, newConditionalRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getConditionalUpdate() {
		return conditionalUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalUpdate(org.hl7.fhir.Boolean newConditionalUpdate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldConditionalUpdate = conditionalUpdate;
		conditionalUpdate = newConditionalUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE, oldConditionalUpdate, newConditionalUpdate);
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
	public void setConditionalUpdate(org.hl7.fhir.Boolean newConditionalUpdate) {
		if (newConditionalUpdate != conditionalUpdate) {
			NotificationChain msgs = null;
			if (conditionalUpdate != null)
				msgs = ((InternalEObject)conditionalUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE, null, msgs);
			if (newConditionalUpdate != null)
				msgs = ((InternalEObject)newConditionalUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE, null, msgs);
			msgs = basicSetConditionalUpdate(newConditionalUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE, newConditionalUpdate, newConditionalUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getConditionalPatch() {
		return conditionalPatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalPatch(org.hl7.fhir.Boolean newConditionalPatch, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldConditionalPatch = conditionalPatch;
		conditionalPatch = newConditionalPatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH, oldConditionalPatch, newConditionalPatch);
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
	public void setConditionalPatch(org.hl7.fhir.Boolean newConditionalPatch) {
		if (newConditionalPatch != conditionalPatch) {
			NotificationChain msgs = null;
			if (conditionalPatch != null)
				msgs = ((InternalEObject)conditionalPatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH, null, msgs);
			if (newConditionalPatch != null)
				msgs = ((InternalEObject)newConditionalPatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH, null, msgs);
			msgs = basicSetConditionalPatch(newConditionalPatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH, newConditionalPatch, newConditionalPatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalDeleteStatus getConditionalDelete() {
		return conditionalDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalDelete(ConditionalDeleteStatus newConditionalDelete, NotificationChain msgs) {
		ConditionalDeleteStatus oldConditionalDelete = conditionalDelete;
		conditionalDelete = newConditionalDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE, oldConditionalDelete, newConditionalDelete);
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
	public void setConditionalDelete(ConditionalDeleteStatus newConditionalDelete) {
		if (newConditionalDelete != conditionalDelete) {
			NotificationChain msgs = null;
			if (conditionalDelete != null)
				msgs = ((InternalEObject)conditionalDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE, null, msgs);
			if (newConditionalDelete != null)
				msgs = ((InternalEObject)newConditionalDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE, null, msgs);
			msgs = basicSetConditionalDelete(newConditionalDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE, newConditionalDelete, newConditionalDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceHandlingPolicy> getReferencePolicy() {
		if (referencePolicy == null) {
			referencePolicy = new EObjectContainmentEList<ReferenceHandlingPolicy>(ReferenceHandlingPolicy.class, this, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__REFERENCE_POLICY);
		}
		return referencePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getSearchInclude() {
		if (searchInclude == null) {
			searchInclude = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_INCLUDE);
		}
		return searchInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getSearchRevInclude() {
		if (searchRevInclude == null) {
			searchRevInclude = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_REV_INCLUDE);
		}
		return searchRevInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementSearchParam> getSearchParam() {
		if (searchParam == null) {
			searchParam = new EObjectContainmentEList<CapabilityStatementSearchParam>(CapabilityStatementSearchParam.class, this, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_PARAM);
		}
		return searchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<CapabilityStatementOperation>(CapabilityStatementOperation.class, this, FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE:
				return basicSetProfile(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SUPPORTED_PROFILE:
				return ((InternalEList<?>)getSupportedProfile()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__INTERACTION:
				return ((InternalEList<?>)getInteraction()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING:
				return basicSetVersioning(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY:
				return basicSetReadHistory(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE:
				return basicSetUpdateCreate(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE:
				return basicSetConditionalCreate(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ:
				return basicSetConditionalRead(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE:
				return basicSetConditionalUpdate(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH:
				return basicSetConditionalPatch(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE:
				return basicSetConditionalDelete(null, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__REFERENCE_POLICY:
				return ((InternalEList<?>)getReferencePolicy()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_INCLUDE:
				return ((InternalEList<?>)getSearchInclude()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_REV_INCLUDE:
				return ((InternalEList<?>)getSearchRevInclude()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParam()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE:
				return getType();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE:
				return getProfile();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SUPPORTED_PROFILE:
				return getSupportedProfile();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION:
				return getDocumentation();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__INTERACTION:
				return getInteraction();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING:
				return getVersioning();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY:
				return getReadHistory();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE:
				return getUpdateCreate();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE:
				return getConditionalCreate();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ:
				return getConditionalRead();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE:
				return getConditionalUpdate();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH:
				return getConditionalPatch();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE:
				return getConditionalDelete();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__REFERENCE_POLICY:
				return getReferencePolicy();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_INCLUDE:
				return getSearchInclude();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_REV_INCLUDE:
				return getSearchRevInclude();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_PARAM:
				return getSearchParam();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__OPERATION:
				return getOperation();
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
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE:
				setType((ResourceType)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE:
				setProfile((Canonical)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SUPPORTED_PROFILE:
				getSupportedProfile().clear();
				getSupportedProfile().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends CapabilityStatementInteraction>)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING:
				setVersioning((ResourceVersionPolicy)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY:
				setReadHistory((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ:
				setConditionalRead((ConditionalReadStatus)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH:
				setConditionalPatch((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((ConditionalDeleteStatus)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__REFERENCE_POLICY:
				getReferencePolicy().clear();
				getReferencePolicy().addAll((Collection<? extends ReferenceHandlingPolicy>)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_INCLUDE:
				getSearchInclude().clear();
				getSearchInclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_REV_INCLUDE:
				getSearchRevInclude().clear();
				getSearchRevInclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_PARAM:
				getSearchParam().clear();
				getSearchParam().addAll((Collection<? extends CapabilityStatementSearchParam>)newValue);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends CapabilityStatementOperation>)newValue);
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
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE:
				setType((ResourceType)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE:
				setProfile((Canonical)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SUPPORTED_PROFILE:
				getSupportedProfile().clear();
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION:
				setDocumentation((Markdown)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__INTERACTION:
				getInteraction().clear();
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING:
				setVersioning((ResourceVersionPolicy)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY:
				setReadHistory((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ:
				setConditionalRead((ConditionalReadStatus)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH:
				setConditionalPatch((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((ConditionalDeleteStatus)null);
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__REFERENCE_POLICY:
				getReferencePolicy().clear();
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_INCLUDE:
				getSearchInclude().clear();
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_REV_INCLUDE:
				getSearchRevInclude().clear();
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_PARAM:
				getSearchParam().clear();
				return;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__OPERATION:
				getOperation().clear();
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
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__TYPE:
				return type != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__PROFILE:
				return profile != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SUPPORTED_PROFILE:
				return supportedProfile != null && !supportedProfile.isEmpty();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__DOCUMENTATION:
				return documentation != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__INTERACTION:
				return interaction != null && !interaction.isEmpty();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__VERSIONING:
				return versioning != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__READ_HISTORY:
				return readHistory != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__UPDATE_CREATE:
				return updateCreate != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_CREATE:
				return conditionalCreate != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_READ:
				return conditionalRead != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_UPDATE:
				return conditionalUpdate != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_PATCH:
				return conditionalPatch != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__CONDITIONAL_DELETE:
				return conditionalDelete != null;
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__REFERENCE_POLICY:
				return referencePolicy != null && !referencePolicy.isEmpty();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_INCLUDE:
				return searchInclude != null && !searchInclude.isEmpty();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_REV_INCLUDE:
				return searchRevInclude != null && !searchRevInclude.isEmpty();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__SEARCH_PARAM:
				return searchParam != null && !searchParam.isEmpty();
			case FHIRPackage.CAPABILITY_STATEMENT_RESOURCE__OPERATION:
				return operation != null && !operation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementResourceImpl
