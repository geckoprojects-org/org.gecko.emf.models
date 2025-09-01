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
package net.opengis.ogc.features.impl;

import net.opengis.ogc.features.Begin;
import net.opengis.ogc.features.End;
import net.opengis.ogc.features.OGCFeaturesPackage;
import net.opengis.ogc.features.TemporalPeriod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.impl.TemporalPeriodImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.TemporalPeriodImpl#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.TemporalPeriodImpl#getTrs <em>Trs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalPeriodImpl extends TemporalExtentImpl implements TemporalPeriod {
	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected Begin begin;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected End end;

	/**
	 * The default value of the '{@link #getTrs() <em>Trs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrs()
	 * @generated
	 * @ordered
	 */
	protected static final String TRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrs() <em>Trs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrs()
	 * @generated
	 * @ordered
	 */
	protected String trs = TRS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCFeaturesPackage.Literals.TEMPORAL_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Begin getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegin(Begin newBegin, NotificationChain msgs) {
		Begin oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN, oldBegin, newBegin);
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
	public void setBegin(Begin newBegin) {
		if (newBegin != begin) {
			NotificationChain msgs = null;
			if (begin != null)
				msgs = ((InternalEObject)begin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN, null, msgs);
			if (newBegin != null)
				msgs = ((InternalEObject)newBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN, null, msgs);
			msgs = basicSetBegin(newBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN, newBegin, newBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.TEMPORAL_PERIOD__END, oldEnd, newEnd);
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
	public void setEnd(End newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.TEMPORAL_PERIOD__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCFeaturesPackage.TEMPORAL_PERIOD__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.TEMPORAL_PERIOD__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrs() {
		return trs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrs(String newTrs) {
		String oldTrs = trs;
		trs = newTrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.TEMPORAL_PERIOD__TRS, oldTrs, trs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN:
				return basicSetBegin(null, msgs);
			case OGCFeaturesPackage.TEMPORAL_PERIOD__END:
				return basicSetEnd(null, msgs);
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
			case OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN:
				return getBegin();
			case OGCFeaturesPackage.TEMPORAL_PERIOD__END:
				return getEnd();
			case OGCFeaturesPackage.TEMPORAL_PERIOD__TRS:
				return getTrs();
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
			case OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN:
				setBegin((Begin)newValue);
				return;
			case OGCFeaturesPackage.TEMPORAL_PERIOD__END:
				setEnd((End)newValue);
				return;
			case OGCFeaturesPackage.TEMPORAL_PERIOD__TRS:
				setTrs((String)newValue);
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
			case OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN:
				setBegin((Begin)null);
				return;
			case OGCFeaturesPackage.TEMPORAL_PERIOD__END:
				setEnd((End)null);
				return;
			case OGCFeaturesPackage.TEMPORAL_PERIOD__TRS:
				setTrs(TRS_EDEFAULT);
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
			case OGCFeaturesPackage.TEMPORAL_PERIOD__BEGIN:
				return begin != null;
			case OGCFeaturesPackage.TEMPORAL_PERIOD__END:
				return end != null;
			case OGCFeaturesPackage.TEMPORAL_PERIOD__TRS:
				return TRS_EDEFAULT == null ? trs != null : !TRS_EDEFAULT.equals(trs);
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
		result.append(" (trs: ");
		result.append(trs);
		result.append(')');
		return result.toString();
	}

} //TemporalPeriodImpl
