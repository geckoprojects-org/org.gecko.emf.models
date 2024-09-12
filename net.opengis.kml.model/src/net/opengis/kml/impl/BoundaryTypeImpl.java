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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.BoundaryType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LinearRingType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.BoundaryTypeImpl#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BoundaryTypeImpl#getBoundarySimpleExtensionGroupGroup <em>Boundary Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BoundaryTypeImpl#getBoundarySimpleExtensionGroup <em>Boundary Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BoundaryTypeImpl#getBoundaryObjectExtensionGroupGroup <em>Boundary Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.BoundaryTypeImpl#getBoundaryObjectExtensionGroup <em>Boundary Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundaryTypeImpl extends MinimalEObjectImpl.Container implements BoundaryType {
	/**
	 * The cached value of the '{@link #getLinearRing() <em>Linear Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearRing()
	 * @generated
	 * @ordered
	 */
	protected LinearRingType linearRing;

	/**
	 * The cached value of the '{@link #getBoundarySimpleExtensionGroupGroup() <em>Boundary Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundarySimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap boundarySimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getBoundaryObjectExtensionGroupGroup() <em>Boundary Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap boundaryObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getBoundaryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearRingType getLinearRing() {
		return linearRing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearRing(LinearRingType newLinearRing, NotificationChain msgs) {
		LinearRingType oldLinearRing = linearRing;
		linearRing = newLinearRing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.BOUNDARY_TYPE__LINEAR_RING, oldLinearRing, newLinearRing);
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
	public void setLinearRing(LinearRingType newLinearRing) {
		if (newLinearRing != linearRing) {
			NotificationChain msgs = null;
			if (linearRing != null)
				msgs = ((InternalEObject)linearRing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.BOUNDARY_TYPE__LINEAR_RING, null, msgs);
			if (newLinearRing != null)
				msgs = ((InternalEObject)newLinearRing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.BOUNDARY_TYPE__LINEAR_RING, null, msgs);
			msgs = basicSetLinearRing(newLinearRing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.BOUNDARY_TYPE__LINEAR_RING, newLinearRing, newLinearRing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBoundarySimpleExtensionGroupGroup() {
		if (boundarySimpleExtensionGroupGroup == null) {
			boundarySimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return boundarySimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getBoundarySimpleExtensionGroup() {
		return getBoundarySimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getBoundaryType_BoundarySimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBoundaryObjectExtensionGroupGroup() {
		if (boundaryObjectExtensionGroupGroup == null) {
			boundaryObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return boundaryObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getBoundaryObjectExtensionGroup() {
		return getBoundaryObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getBoundaryType_BoundaryObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.BOUNDARY_TYPE__LINEAR_RING:
				return basicSetLinearRing(null, msgs);
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getBoundarySimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getBoundaryObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getBoundaryObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.BOUNDARY_TYPE__LINEAR_RING:
				return getLinearRing();
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getBoundarySimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getBoundarySimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP:
				return getBoundarySimpleExtensionGroup();
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getBoundaryObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getBoundaryObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP:
				return getBoundaryObjectExtensionGroup();
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
			case KMLPackage.BOUNDARY_TYPE__LINEAR_RING:
				setLinearRing((LinearRingType)newValue);
				return;
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getBoundarySimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getBoundaryObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.BOUNDARY_TYPE__LINEAR_RING:
				setLinearRing((LinearRingType)null);
				return;
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP_GROUP:
				getBoundarySimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP_GROUP:
				getBoundaryObjectExtensionGroupGroup().clear();
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
			case KMLPackage.BOUNDARY_TYPE__LINEAR_RING:
				return linearRing != null;
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP_GROUP:
				return boundarySimpleExtensionGroupGroup != null && !boundarySimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP:
				return !getBoundarySimpleExtensionGroup().isEmpty();
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP_GROUP:
				return boundaryObjectExtensionGroupGroup != null && !boundaryObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP:
				return !getBoundaryObjectExtensionGroup().isEmpty();
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
		result.append(" (boundarySimpleExtensionGroupGroup: ");
		result.append(boundarySimpleExtensionGroupGroup);
		result.append(", boundaryObjectExtensionGroupGroup: ");
		result.append(boundaryObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //BoundaryTypeImpl
