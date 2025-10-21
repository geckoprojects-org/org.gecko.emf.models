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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType;
import de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType2;
import de.online.adv.namespaces.adv.sk.xml.skadv.GeometryType2;
import de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.AreaGraphicTypeImpl#getInterior <em>Interior</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.AreaGraphicTypeImpl#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.AreaGraphicTypeImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaGraphicTypeImpl extends SimpleGraphicTypeImpl implements AreaGraphicType {
	/**
	 * The cached value of the '{@link #getInterior() <em>Interior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior()
	 * @generated
	 * @ordered
	 */
	protected InteriorType1 interior;

	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected BoundaryType2 boundary;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryType2 geometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaGraphicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getAreaGraphicType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteriorType1 getInterior() {
		return interior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterior(InteriorType1 newInterior, NotificationChain msgs) {
		InteriorType1 oldInterior = interior;
		interior = newInterior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR, oldInterior, newInterior);
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
	public void setInterior(InteriorType1 newInterior) {
		if (newInterior != interior) {
			NotificationChain msgs = null;
			if (interior != null)
				msgs = ((InternalEObject)interior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR, null, msgs);
			if (newInterior != null)
				msgs = ((InternalEObject)newInterior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR, null, msgs);
			msgs = basicSetInterior(newInterior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR, newInterior, newInterior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryType2 getBoundary() {
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundary(BoundaryType2 newBoundary, NotificationChain msgs) {
		BoundaryType2 oldBoundary = boundary;
		boundary = newBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY, oldBoundary, newBoundary);
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
	public void setBoundary(BoundaryType2 newBoundary) {
		if (newBoundary != boundary) {
			NotificationChain msgs = null;
			if (boundary != null)
				msgs = ((InternalEObject)boundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY, null, msgs);
			if (newBoundary != null)
				msgs = ((InternalEObject)newBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY, null, msgs);
			msgs = basicSetBoundary(newBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY, newBoundary, newBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryType2 getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(GeometryType2 newGeometry, NotificationChain msgs) {
		GeometryType2 oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(GeometryType2 newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR:
				return basicSetInterior(null, msgs);
			case AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY:
				return basicSetBoundary(null, msgs);
			case AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY:
				return basicSetGeometry(null, msgs);
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
			case AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR:
				return getInterior();
			case AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY:
				return getBoundary();
			case AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY:
				return getGeometry();
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
			case AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR:
				setInterior((InteriorType1)newValue);
				return;
			case AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY:
				setBoundary((BoundaryType2)newValue);
				return;
			case AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY:
				setGeometry((GeometryType2)newValue);
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
			case AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR:
				setInterior((InteriorType1)null);
				return;
			case AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY:
				setBoundary((BoundaryType2)null);
				return;
			case AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY:
				setGeometry((GeometryType2)null);
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
			case AAAPackage.AREA_GRAPHIC_TYPE__INTERIOR:
				return interior != null;
			case AAAPackage.AREA_GRAPHIC_TYPE__BOUNDARY:
				return boundary != null;
			case AAAPackage.AREA_GRAPHIC_TYPE__GEOMETRY:
				return geometry != null;
		}
		return super.eIsSet(featureID);
	}

} //AreaGraphicTypeImpl
