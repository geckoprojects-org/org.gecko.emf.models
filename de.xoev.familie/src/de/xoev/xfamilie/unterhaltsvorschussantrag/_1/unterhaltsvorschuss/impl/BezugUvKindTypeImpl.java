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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bezug Uv Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BezugUvKindTypeImpl#getBezugsJugendamt <em>Bezugs Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BezugUvKindTypeImpl#getBisWann <em>Bis Wann</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BezugUvKindTypeImpl extends MinimalEObjectImpl.Container implements BezugUvKindType {
	/**
	 * The default value of the '{@link #getBezugsJugendamt() <em>Bezugs Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugsJugendamt()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZUGS_JUGENDAMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezugsJugendamt() <em>Bezugs Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugsJugendamt()
	 * @generated
	 * @ordered
	 */
	protected String bezugsJugendamt = BEZUGS_JUGENDAMT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBisWann() <em>Bis Wann</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBisWann()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType bisWann;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BezugUvKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getBezugUvKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBezugsJugendamt() {
		return bezugsJugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugsJugendamt(String newBezugsJugendamt) {
		String oldBezugsJugendamt = bezugsJugendamt;
		bezugsJugendamt = newBezugsJugendamt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BEZUGS_JUGENDAMT, oldBezugsJugendamt, bezugsJugendamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getBisWann() {
		return bisWann;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBisWann(TeilbekanntesDatumType newBisWann, NotificationChain msgs) {
		TeilbekanntesDatumType oldBisWann = bisWann;
		bisWann = newBisWann;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN, oldBisWann, newBisWann);
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
	public void setBisWann(TeilbekanntesDatumType newBisWann) {
		if (newBisWann != bisWann) {
			NotificationChain msgs = null;
			if (bisWann != null)
				msgs = ((InternalEObject)bisWann).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN, null, msgs);
			if (newBisWann != null)
				msgs = ((InternalEObject)newBisWann).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN, null, msgs);
			msgs = basicSetBisWann(newBisWann, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN, newBisWann, newBisWann));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN:
				return basicSetBisWann(null, msgs);
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
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BEZUGS_JUGENDAMT:
				return getBezugsJugendamt();
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN:
				return getBisWann();
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
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BEZUGS_JUGENDAMT:
				setBezugsJugendamt((String)newValue);
				return;
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN:
				setBisWann((TeilbekanntesDatumType)newValue);
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
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BEZUGS_JUGENDAMT:
				setBezugsJugendamt(BEZUGS_JUGENDAMT_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN:
				setBisWann((TeilbekanntesDatumType)null);
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
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BEZUGS_JUGENDAMT:
				return BEZUGS_JUGENDAMT_EDEFAULT == null ? bezugsJugendamt != null : !BEZUGS_JUGENDAMT_EDEFAULT.equals(bezugsJugendamt);
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE__BIS_WANN:
				return bisWann != null;
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
		result.append(" (bezugsJugendamt: ");
		result.append(bezugsJugendamt);
		result.append(')');
		return result.toString();
	}

} //BezugUvKindTypeImpl
