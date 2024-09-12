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

import java.util.Collection;

import net.opengis.gml.gml.AbstractRingPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.PolygonPatchType;
import net.opengis.gml.gml.SurfaceInterpolationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Patch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.PolygonPatchTypeImpl#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.PolygonPatchTypeImpl#getInterior <em>Interior</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.PolygonPatchTypeImpl#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonPatchTypeImpl extends AbstractSurfacePatchTypeImpl implements PolygonPatchType {
	/**
	 * The cached value of the '{@link #getExterior() <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior()
	 * @generated
	 * @ordered
	 */
	protected AbstractRingPropertyType exterior;

	/**
	 * The cached value of the '{@link #getInterior() <em>Interior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRingPropertyType> interior;

	/**
	 * The default value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final SurfaceInterpolationType INTERPOLATION_EDEFAULT = SurfaceInterpolationType.PLANAR;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected SurfaceInterpolationType interpolation = INTERPOLATION_EDEFAULT;

	/**
	 * This is true if the Interpolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interpolationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonPatchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getPolygonPatchType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRingPropertyType getExterior() {
		return exterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExterior(AbstractRingPropertyType newExterior, NotificationChain msgs) {
		AbstractRingPropertyType oldExterior = exterior;
		exterior = newExterior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR, oldExterior, newExterior);
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
	public void setExterior(AbstractRingPropertyType newExterior) {
		if (newExterior != exterior) {
			NotificationChain msgs = null;
			if (exterior != null)
				msgs = ((InternalEObject)exterior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR, null, msgs);
			if (newExterior != null)
				msgs = ((InternalEObject)newExterior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR, null, msgs);
			msgs = basicSetExterior(newExterior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR, newExterior, newExterior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractRingPropertyType> getInterior() {
		if (interior == null) {
			interior = new EObjectContainmentEList<AbstractRingPropertyType>(AbstractRingPropertyType.class, this, GMLPackage.POLYGON_PATCH_TYPE__INTERIOR);
		}
		return interior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceInterpolationType getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolation(SurfaceInterpolationType newInterpolation) {
		SurfaceInterpolationType oldInterpolation = interpolation;
		interpolation = newInterpolation == null ? INTERPOLATION_EDEFAULT : newInterpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.POLYGON_PATCH_TYPE__INTERPOLATION, oldInterpolation, interpolation, !oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInterpolation() {
		SurfaceInterpolationType oldInterpolation = interpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolation = INTERPOLATION_EDEFAULT;
		interpolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.POLYGON_PATCH_TYPE__INTERPOLATION, oldInterpolation, INTERPOLATION_EDEFAULT, oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInterpolation() {
		return interpolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR:
				return basicSetExterior(null, msgs);
			case GMLPackage.POLYGON_PATCH_TYPE__INTERIOR:
				return ((InternalEList<?>)getInterior()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR:
				return getExterior();
			case GMLPackage.POLYGON_PATCH_TYPE__INTERIOR:
				return getInterior();
			case GMLPackage.POLYGON_PATCH_TYPE__INTERPOLATION:
				return getInterpolation();
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
			case GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)newValue);
				return;
			case GMLPackage.POLYGON_PATCH_TYPE__INTERIOR:
				getInterior().clear();
				getInterior().addAll((Collection<? extends AbstractRingPropertyType>)newValue);
				return;
			case GMLPackage.POLYGON_PATCH_TYPE__INTERPOLATION:
				setInterpolation((SurfaceInterpolationType)newValue);
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
			case GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)null);
				return;
			case GMLPackage.POLYGON_PATCH_TYPE__INTERIOR:
				getInterior().clear();
				return;
			case GMLPackage.POLYGON_PATCH_TYPE__INTERPOLATION:
				unsetInterpolation();
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
			case GMLPackage.POLYGON_PATCH_TYPE__EXTERIOR:
				return exterior != null;
			case GMLPackage.POLYGON_PATCH_TYPE__INTERIOR:
				return interior != null && !interior.isEmpty();
			case GMLPackage.POLYGON_PATCH_TYPE__INTERPOLATION:
				return isSetInterpolation();
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
		result.append(" (interpolation: ");
		if (interpolationESet) result.append(interpolation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PolygonPatchTypeImpl
