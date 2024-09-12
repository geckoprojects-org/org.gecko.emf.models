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
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetIncludeImpl#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetIncludeImpl extends BackboneElementImpl implements ValueSetInclude {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetConcept> concept;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetFilter> filter;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> valueSet;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyright;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getValueSetInclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_INCLUDE__SYSTEM, oldSystem, newSystem);
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
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_INCLUDE__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_INCLUDE__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_INCLUDE__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_INCLUDE__VERSION, oldVersion, newVersion);
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
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_INCLUDE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_INCLUDE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_INCLUDE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSetConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<ValueSetConcept>(ValueSetConcept.class, this, FHIRPackage.VALUE_SET_INCLUDE__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSetFilter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<ValueSetFilter>(ValueSetFilter.class, this, FHIRPackage.VALUE_SET_INCLUDE__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<Canonical>(Canonical.class, this, FHIRPackage.VALUE_SET_INCLUDE__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(org.hl7.fhir.String newCopyright, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT, oldCopyright, newCopyright);
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
	public void setCopyright(org.hl7.fhir.String newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.VALUE_SET_INCLUDE__SYSTEM:
				return basicSetSystem(null, msgs);
			case FHIRPackage.VALUE_SET_INCLUDE__VERSION:
				return basicSetVersion(null, msgs);
			case FHIRPackage.VALUE_SET_INCLUDE__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FHIRPackage.VALUE_SET_INCLUDE__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case FHIRPackage.VALUE_SET_INCLUDE__VALUE_SET:
				return ((InternalEList<?>)getValueSet()).basicRemove(otherEnd, msgs);
			case FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
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
			case FHIRPackage.VALUE_SET_INCLUDE__SYSTEM:
				return getSystem();
			case FHIRPackage.VALUE_SET_INCLUDE__VERSION:
				return getVersion();
			case FHIRPackage.VALUE_SET_INCLUDE__CONCEPT:
				return getConcept();
			case FHIRPackage.VALUE_SET_INCLUDE__FILTER:
				return getFilter();
			case FHIRPackage.VALUE_SET_INCLUDE__VALUE_SET:
				return getValueSet();
			case FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT:
				return getCopyright();
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
			case FHIRPackage.VALUE_SET_INCLUDE__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends ValueSetConcept>)newValue);
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends ValueSetFilter>)newValue);
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends Canonical>)newValue);
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.VALUE_SET_INCLUDE__SYSTEM:
				setSystem((Uri)null);
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__CONCEPT:
				getConcept().clear();
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__FILTER:
				getFilter().clear();
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__VALUE_SET:
				getValueSet().clear();
				return;
			case FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
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
			case FHIRPackage.VALUE_SET_INCLUDE__SYSTEM:
				return system != null;
			case FHIRPackage.VALUE_SET_INCLUDE__VERSION:
				return version != null;
			case FHIRPackage.VALUE_SET_INCLUDE__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FHIRPackage.VALUE_SET_INCLUDE__FILTER:
				return filter != null && !filter.isEmpty();
			case FHIRPackage.VALUE_SET_INCLUDE__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
			case FHIRPackage.VALUE_SET_INCLUDE__COPYRIGHT:
				return copyright != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetIncludeImpl
