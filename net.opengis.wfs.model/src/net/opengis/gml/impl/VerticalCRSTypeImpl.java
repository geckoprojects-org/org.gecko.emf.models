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
package net.opengis.gml.impl;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.VerticalCRSType;
import net.opengis.gml.VerticalCSRefType;
import net.opengis.gml.VerticalDatumRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.VerticalCRSTypeImpl#getUsesVerticalCS <em>Uses Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.VerticalCRSTypeImpl#getUsesVerticalDatum <em>Uses Vertical Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticalCRSTypeImpl extends AbstractReferenceSystemTypeImpl implements VerticalCRSType {
	/**
	 * The cached value of the '{@link #getUsesVerticalCS() <em>Uses Vertical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesVerticalCS()
	 * @generated
	 * @ordered
	 */
	protected VerticalCSRefType usesVerticalCS;

	/**
	 * The cached value of the '{@link #getUsesVerticalDatum() <em>Uses Vertical Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesVerticalDatum()
	 * @generated
	 * @ordered
	 */
	protected VerticalDatumRefType usesVerticalDatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getVerticalCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSRefType getUsesVerticalCS() {
		return usesVerticalCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesVerticalCS(VerticalCSRefType newUsesVerticalCS, NotificationChain msgs) {
		VerticalCSRefType oldUsesVerticalCS = usesVerticalCS;
		usesVerticalCS = newUsesVerticalCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS, oldUsesVerticalCS, newUsesVerticalCS);
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
	public void setUsesVerticalCS(VerticalCSRefType newUsesVerticalCS) {
		if (newUsesVerticalCS != usesVerticalCS) {
			NotificationChain msgs = null;
			if (usesVerticalCS != null)
				msgs = ((InternalEObject)usesVerticalCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS, null, msgs);
			if (newUsesVerticalCS != null)
				msgs = ((InternalEObject)newUsesVerticalCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS, null, msgs);
			msgs = basicSetUsesVerticalCS(newUsesVerticalCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS, newUsesVerticalCS, newUsesVerticalCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumRefType getUsesVerticalDatum() {
		return usesVerticalDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesVerticalDatum(VerticalDatumRefType newUsesVerticalDatum, NotificationChain msgs) {
		VerticalDatumRefType oldUsesVerticalDatum = usesVerticalDatum;
		usesVerticalDatum = newUsesVerticalDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM, oldUsesVerticalDatum, newUsesVerticalDatum);
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
	public void setUsesVerticalDatum(VerticalDatumRefType newUsesVerticalDatum) {
		if (newUsesVerticalDatum != usesVerticalDatum) {
			NotificationChain msgs = null;
			if (usesVerticalDatum != null)
				msgs = ((InternalEObject)usesVerticalDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM, null, msgs);
			if (newUsesVerticalDatum != null)
				msgs = ((InternalEObject)newUsesVerticalDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM, null, msgs);
			msgs = basicSetUsesVerticalDatum(newUsesVerticalDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM, newUsesVerticalDatum, newUsesVerticalDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS:
				return basicSetUsesVerticalCS(null, msgs);
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM:
				return basicSetUsesVerticalDatum(null, msgs);
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
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS:
				return getUsesVerticalCS();
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM:
				return getUsesVerticalDatum();
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
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS:
				setUsesVerticalCS((VerticalCSRefType)newValue);
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM:
				setUsesVerticalDatum((VerticalDatumRefType)newValue);
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
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS:
				setUsesVerticalCS((VerticalCSRefType)null);
				return;
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM:
				setUsesVerticalDatum((VerticalDatumRefType)null);
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
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_CS:
				return usesVerticalCS != null;
			case GMLPackage.VERTICAL_CRS_TYPE__USES_VERTICAL_DATUM:
				return usesVerticalDatum != null;
		}
		return super.eIsSet(featureID);
	}

} //VerticalCRSTypeImpl
