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
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.TerminologyCapabilitiesCodeSystem;
import org.hl7.fhir.TerminologyCapabilitiesVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesCodeSystemImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesCodeSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesCodeSystemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesCodeSystemImpl#getSubsumption <em>Subsumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesCodeSystemImpl extends BackboneElementImpl implements TerminologyCapabilitiesCodeSystem {
	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected Canonical uri;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesVersion> version;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemContentMode content;

	/**
	 * The cached value of the '{@link #getSubsumption() <em>Subsumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsumption()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean subsumption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesCodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getTerminologyCapabilitiesCodeSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(Canonical newUri, NotificationChain msgs) {
		Canonical oldUri = uri;
		uri = newUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, oldUri, newUri);
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
	public void setUri(Canonical newUri) {
		if (newUri != uri) {
			NotificationChain msgs = null;
			if (uri != null)
				msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, null, msgs);
			if (newUri != null)
				msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, null, msgs);
			msgs = basicSetUri(newUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, newUri, newUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminologyCapabilitiesVersion> getVersion() {
		if (version == null) {
			version = new EObjectContainmentEList<TerminologyCapabilitiesVersion>(TerminologyCapabilitiesVersion.class, this, FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION);
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemContentMode getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(CodeSystemContentMode newContent, NotificationChain msgs) {
		CodeSystemContentMode oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT, oldContent, newContent);
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
	public void setContent(CodeSystemContentMode newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getSubsumption() {
		return subsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsumption(org.hl7.fhir.Boolean newSubsumption, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldSubsumption = subsumption;
		subsumption = newSubsumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, oldSubsumption, newSubsumption);
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
	public void setSubsumption(org.hl7.fhir.Boolean newSubsumption) {
		if (newSubsumption != subsumption) {
			NotificationChain msgs = null;
			if (subsumption != null)
				msgs = ((InternalEObject)subsumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, null, msgs);
			if (newSubsumption != null)
				msgs = ((InternalEObject)newSubsumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, null, msgs);
			msgs = basicSetSubsumption(newSubsumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, newSubsumption, newSubsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return basicSetUri(null, msgs);
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT:
				return basicSetContent(null, msgs);
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return basicSetSubsumption(null, msgs);
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return getUri();
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return getVersion();
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT:
				return getContent();
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return getSubsumption();
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				setUri((Canonical)newValue);
				return;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends TerminologyCapabilitiesVersion>)newValue);
				return;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT:
				setContent((CodeSystemContentMode)newValue);
				return;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				setSubsumption((org.hl7.fhir.Boolean)newValue);
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				setUri((Canonical)null);
				return;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				getVersion().clear();
				return;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT:
				setContent((CodeSystemContentMode)null);
				return;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				setSubsumption((org.hl7.fhir.Boolean)null);
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return uri != null;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return version != null && !version.isEmpty();
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__CONTENT:
				return content != null;
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return subsumption != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesCodeSystemImpl
