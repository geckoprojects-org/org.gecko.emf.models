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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.TemporalCRSType;
import net.opengis.gml.gml.TemporalCSPropertyType;
import net.opengis.gml.gml.TemporalDatumPropertyType;
import net.opengis.gml.gml.TimeCSPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.TemporalCRSTypeImpl#getTimeCSGroup <em>Time CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TemporalCRSTypeImpl#getTimeCS <em>Time CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TemporalCRSTypeImpl#getUsesTemporalCS <em>Uses Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TemporalCRSTypeImpl#getTemporalDatumGroup <em>Temporal Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TemporalCRSTypeImpl#getTemporalDatum <em>Temporal Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalCRSTypeImpl extends AbstractCRSTypeImpl implements TemporalCRSType {
	/**
	 * The cached value of the '{@link #getTimeCSGroup() <em>Time CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timeCSGroup;

	/**
	 * The cached value of the '{@link #getUsesTemporalCS() <em>Uses Temporal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesTemporalCS()
	 * @generated
	 * @ordered
	 */
	protected TemporalCSPropertyType usesTemporalCS;

	/**
	 * The cached value of the '{@link #getTemporalDatumGroup() <em>Temporal Datum Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalDatumGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap temporalDatumGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTemporalCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTimeCSGroup() {
		if (timeCSGroup == null) {
			timeCSGroup = new BasicFeatureMap(this, GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS_GROUP);
		}
		return timeCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCSPropertyType getTimeCS() {
		return (TimeCSPropertyType)getTimeCSGroup().get(GMLPackage.eINSTANCE.getTemporalCRSType_TimeCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCS(TimeCSPropertyType newTimeCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTimeCSGroup()).basicAdd(GMLPackage.eINSTANCE.getTemporalCRSType_TimeCS(), newTimeCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCS(TimeCSPropertyType newTimeCS) {
		((FeatureMap.Internal)getTimeCSGroup()).set(GMLPackage.eINSTANCE.getTemporalCRSType_TimeCS(), newTimeCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCSPropertyType getUsesTemporalCS() {
		return usesTemporalCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTemporalCS(TemporalCSPropertyType newUsesTemporalCS, NotificationChain msgs) {
		TemporalCSPropertyType oldUsesTemporalCS = usesTemporalCS;
		usesTemporalCS = newUsesTemporalCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, oldUsesTemporalCS, newUsesTemporalCS);
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
	public void setUsesTemporalCS(TemporalCSPropertyType newUsesTemporalCS) {
		if (newUsesTemporalCS != usesTemporalCS) {
			NotificationChain msgs = null;
			if (usesTemporalCS != null)
				msgs = ((InternalEObject)usesTemporalCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, null, msgs);
			if (newUsesTemporalCS != null)
				msgs = ((InternalEObject)newUsesTemporalCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, null, msgs);
			msgs = basicSetUsesTemporalCS(newUsesTemporalCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, newUsesTemporalCS, newUsesTemporalCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTemporalDatumGroup() {
		if (temporalDatumGroup == null) {
			temporalDatumGroup = new BasicFeatureMap(this, GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM_GROUP);
		}
		return temporalDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumPropertyType getTemporalDatum() {
		return (TemporalDatumPropertyType)getTemporalDatumGroup().get(GMLPackage.eINSTANCE.getTemporalCRSType_TemporalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatum(TemporalDatumPropertyType newTemporalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTemporalDatumGroup()).basicAdd(GMLPackage.eINSTANCE.getTemporalCRSType_TemporalDatum(), newTemporalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalDatum(TemporalDatumPropertyType newTemporalDatum) {
		((FeatureMap.Internal)getTemporalDatumGroup()).set(GMLPackage.eINSTANCE.getTemporalCRSType_TemporalDatum(), newTemporalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS_GROUP:
				return ((InternalEList<?>)getTimeCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS:
				return basicSetTimeCS(null, msgs);
			case GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				return basicSetUsesTemporalCS(null, msgs);
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM_GROUP:
				return ((InternalEList<?>)getTemporalDatumGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM:
				return basicSetTemporalDatum(null, msgs);
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
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS_GROUP:
				if (coreType) return getTimeCSGroup();
				return ((FeatureMap.Internal)getTimeCSGroup()).getWrapper();
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS:
				return getTimeCS();
			case GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				return getUsesTemporalCS();
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM_GROUP:
				if (coreType) return getTemporalDatumGroup();
				return ((FeatureMap.Internal)getTemporalDatumGroup()).getWrapper();
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM:
				return getTemporalDatum();
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
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS_GROUP:
				((FeatureMap.Internal)getTimeCSGroup()).set(newValue);
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS:
				setTimeCS((TimeCSPropertyType)newValue);
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSPropertyType)newValue);
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM_GROUP:
				((FeatureMap.Internal)getTemporalDatumGroup()).set(newValue);
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM:
				setTemporalDatum((TemporalDatumPropertyType)newValue);
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
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS_GROUP:
				getTimeCSGroup().clear();
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS:
				setTimeCS((TimeCSPropertyType)null);
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSPropertyType)null);
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM_GROUP:
				getTemporalDatumGroup().clear();
				return;
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM:
				setTemporalDatum((TemporalDatumPropertyType)null);
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
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS_GROUP:
				return timeCSGroup != null && !timeCSGroup.isEmpty();
			case GMLPackage.TEMPORAL_CRS_TYPE__TIME_CS:
				return getTimeCS() != null;
			case GMLPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				return usesTemporalCS != null;
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM_GROUP:
				return temporalDatumGroup != null && !temporalDatumGroup.isEmpty();
			case GMLPackage.TEMPORAL_CRS_TYPE__TEMPORAL_DATUM:
				return getTemporalDatum() != null;
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
		result.append(" (timeCSGroup: ");
		result.append(timeCSGroup);
		result.append(", temporalDatumGroup: ");
		result.append(temporalDatumGroup);
		result.append(')');
		return result.toString();
	}

} //TemporalCRSTypeImpl
