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
package net.opengis.fes.impl;

import net.opengis.fes.AvailableFunctionsType;
import net.opengis.fes.ConformanceType;
import net.opengis.fes.ExtendedCapabilitiesType;
import net.opengis.fes.FESPackage;
import net.opengis.fes.FilterCapabilitiesType;
import net.opengis.fes.IdCapabilitiesType;
import net.opengis.fes.ScalarCapabilitiesType;
import net.opengis.fes.SpatialCapabilitiesType;
import net.opengis.fes.TemporalCapabilitiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.FilterCapabilitiesTypeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterCapabilitiesTypeImpl#getIdCapabilities <em>Id Capabilities</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterCapabilitiesTypeImpl#getScalarCapabilities <em>Scalar Capabilities</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterCapabilitiesTypeImpl#getSpatialCapabilities <em>Spatial Capabilities</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterCapabilitiesTypeImpl#getTemporalCapabilities <em>Temporal Capabilities</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterCapabilitiesTypeImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link net.opengis.fes.impl.FilterCapabilitiesTypeImpl#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements FilterCapabilitiesType {
	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected ConformanceType conformance;

	/**
	 * The cached value of the '{@link #getIdCapabilities() <em>Id Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCapabilities()
	 * @generated
	 * @ordered
	 */
	protected IdCapabilitiesType idCapabilities;

	/**
	 * The cached value of the '{@link #getScalarCapabilities() <em>Scalar Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarCapabilities()
	 * @generated
	 * @ordered
	 */
	protected ScalarCapabilitiesType scalarCapabilities;

	/**
	 * The cached value of the '{@link #getSpatialCapabilities() <em>Spatial Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialCapabilities()
	 * @generated
	 * @ordered
	 */
	protected SpatialCapabilitiesType spatialCapabilities;

	/**
	 * The cached value of the '{@link #getTemporalCapabilities() <em>Temporal Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected TemporalCapabilitiesType temporalCapabilities;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected AvailableFunctionsType functions;

	/**
	 * The cached value of the '{@link #getExtendedCapabilities() <em>Extended Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected ExtendedCapabilitiesType extendedCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.FILTER_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConformanceType getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformance(ConformanceType newConformance, NotificationChain msgs) {
		ConformanceType oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE, oldConformance, newConformance);
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
	public void setConformance(ConformanceType newConformance) {
		if (newConformance != conformance) {
			NotificationChain msgs = null;
			if (conformance != null)
				msgs = ((InternalEObject)conformance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE, null, msgs);
			if (newConformance != null)
				msgs = ((InternalEObject)newConformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE, null, msgs);
			msgs = basicSetConformance(newConformance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE, newConformance, newConformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdCapabilitiesType getIdCapabilities() {
		return idCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdCapabilities(IdCapabilitiesType newIdCapabilities, NotificationChain msgs) {
		IdCapabilitiesType oldIdCapabilities = idCapabilities;
		idCapabilities = newIdCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, oldIdCapabilities, newIdCapabilities);
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
	public void setIdCapabilities(IdCapabilitiesType newIdCapabilities) {
		if (newIdCapabilities != idCapabilities) {
			NotificationChain msgs = null;
			if (idCapabilities != null)
				msgs = ((InternalEObject)idCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, null, msgs);
			if (newIdCapabilities != null)
				msgs = ((InternalEObject)newIdCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, null, msgs);
			msgs = basicSetIdCapabilities(newIdCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES, newIdCapabilities, newIdCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalarCapabilitiesType getScalarCapabilities() {
		return scalarCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalarCapabilities(ScalarCapabilitiesType newScalarCapabilities, NotificationChain msgs) {
		ScalarCapabilitiesType oldScalarCapabilities = scalarCapabilities;
		scalarCapabilities = newScalarCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, oldScalarCapabilities, newScalarCapabilities);
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
	public void setScalarCapabilities(ScalarCapabilitiesType newScalarCapabilities) {
		if (newScalarCapabilities != scalarCapabilities) {
			NotificationChain msgs = null;
			if (scalarCapabilities != null)
				msgs = ((InternalEObject)scalarCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, null, msgs);
			if (newScalarCapabilities != null)
				msgs = ((InternalEObject)newScalarCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, null, msgs);
			msgs = basicSetScalarCapabilities(newScalarCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES, newScalarCapabilities, newScalarCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialCapabilitiesType getSpatialCapabilities() {
		return spatialCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialCapabilities(SpatialCapabilitiesType newSpatialCapabilities, NotificationChain msgs) {
		SpatialCapabilitiesType oldSpatialCapabilities = spatialCapabilities;
		spatialCapabilities = newSpatialCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, oldSpatialCapabilities, newSpatialCapabilities);
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
	public void setSpatialCapabilities(SpatialCapabilitiesType newSpatialCapabilities) {
		if (newSpatialCapabilities != spatialCapabilities) {
			NotificationChain msgs = null;
			if (spatialCapabilities != null)
				msgs = ((InternalEObject)spatialCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, null, msgs);
			if (newSpatialCapabilities != null)
				msgs = ((InternalEObject)newSpatialCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, null, msgs);
			msgs = basicSetSpatialCapabilities(newSpatialCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES, newSpatialCapabilities, newSpatialCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCapabilitiesType getTemporalCapabilities() {
		return temporalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCapabilities(TemporalCapabilitiesType newTemporalCapabilities, NotificationChain msgs) {
		TemporalCapabilitiesType oldTemporalCapabilities = temporalCapabilities;
		temporalCapabilities = newTemporalCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES, oldTemporalCapabilities, newTemporalCapabilities);
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
	public void setTemporalCapabilities(TemporalCapabilitiesType newTemporalCapabilities) {
		if (newTemporalCapabilities != temporalCapabilities) {
			NotificationChain msgs = null;
			if (temporalCapabilities != null)
				msgs = ((InternalEObject)temporalCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES, null, msgs);
			if (newTemporalCapabilities != null)
				msgs = ((InternalEObject)newTemporalCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES, null, msgs);
			msgs = basicSetTemporalCapabilities(newTemporalCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES, newTemporalCapabilities, newTemporalCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvailableFunctionsType getFunctions() {
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctions(AvailableFunctionsType newFunctions, NotificationChain msgs) {
		AvailableFunctionsType oldFunctions = functions;
		functions = newFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS, oldFunctions, newFunctions);
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
	public void setFunctions(AvailableFunctionsType newFunctions) {
		if (newFunctions != functions) {
			NotificationChain msgs = null;
			if (functions != null)
				msgs = ((InternalEObject)functions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS, null, msgs);
			if (newFunctions != null)
				msgs = ((InternalEObject)newFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS, null, msgs);
			msgs = basicSetFunctions(newFunctions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS, newFunctions, newFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedCapabilitiesType getExtendedCapabilities() {
		return extendedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedCapabilities(ExtendedCapabilitiesType newExtendedCapabilities, NotificationChain msgs) {
		ExtendedCapabilitiesType oldExtendedCapabilities = extendedCapabilities;
		extendedCapabilities = newExtendedCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES, oldExtendedCapabilities, newExtendedCapabilities);
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
	public void setExtendedCapabilities(ExtendedCapabilitiesType newExtendedCapabilities) {
		if (newExtendedCapabilities != extendedCapabilities) {
			NotificationChain msgs = null;
			if (extendedCapabilities != null)
				msgs = ((InternalEObject)extendedCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES, null, msgs);
			if (newExtendedCapabilities != null)
				msgs = ((InternalEObject)newExtendedCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES, null, msgs);
			msgs = basicSetExtendedCapabilities(newExtendedCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES, newExtendedCapabilities, newExtendedCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE:
				return basicSetConformance(null, msgs);
			case FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				return basicSetIdCapabilities(null, msgs);
			case FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				return basicSetScalarCapabilities(null, msgs);
			case FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				return basicSetSpatialCapabilities(null, msgs);
			case FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES:
				return basicSetTemporalCapabilities(null, msgs);
			case FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS:
				return basicSetFunctions(null, msgs);
			case FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES:
				return basicSetExtendedCapabilities(null, msgs);
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
			case FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE:
				return getConformance();
			case FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				return getIdCapabilities();
			case FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				return getScalarCapabilities();
			case FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				return getSpatialCapabilities();
			case FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES:
				return getTemporalCapabilities();
			case FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS:
				return getFunctions();
			case FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES:
				return getExtendedCapabilities();
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
			case FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE:
				setConformance((ConformanceType)newValue);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				setIdCapabilities((IdCapabilitiesType)newValue);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				setScalarCapabilities((ScalarCapabilitiesType)newValue);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				setSpatialCapabilities((SpatialCapabilitiesType)newValue);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES:
				setTemporalCapabilities((TemporalCapabilitiesType)newValue);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS:
				setFunctions((AvailableFunctionsType)newValue);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES:
				setExtendedCapabilities((ExtendedCapabilitiesType)newValue);
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
			case FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE:
				setConformance((ConformanceType)null);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				setIdCapabilities((IdCapabilitiesType)null);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				setScalarCapabilities((ScalarCapabilitiesType)null);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				setSpatialCapabilities((SpatialCapabilitiesType)null);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES:
				setTemporalCapabilities((TemporalCapabilitiesType)null);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS:
				setFunctions((AvailableFunctionsType)null);
				return;
			case FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES:
				setExtendedCapabilities((ExtendedCapabilitiesType)null);
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
			case FESPackage.FILTER_CAPABILITIES_TYPE__CONFORMANCE:
				return conformance != null;
			case FESPackage.FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES:
				return idCapabilities != null;
			case FESPackage.FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES:
				return scalarCapabilities != null;
			case FESPackage.FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES:
				return spatialCapabilities != null;
			case FESPackage.FILTER_CAPABILITIES_TYPE__TEMPORAL_CAPABILITIES:
				return temporalCapabilities != null;
			case FESPackage.FILTER_CAPABILITIES_TYPE__FUNCTIONS:
				return functions != null;
			case FESPackage.FILTER_CAPABILITIES_TYPE__EXTENDED_CAPABILITIES:
				return extendedCapabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterCapabilitiesTypeImpl
