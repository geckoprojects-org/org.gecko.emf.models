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
import net.opengis.kml.KMLPackage;
import net.opengis.kml.ViewVolumeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Volume Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getLeftFov <em>Left Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getRightFov <em>Right Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getBottomFov <em>Bottom Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getTopFov <em>Top Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getNear <em>Near</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getViewVolumeSimpleExtensionGroupGroup <em>View Volume Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getViewVolumeSimpleExtensionGroup <em>View Volume Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getViewVolumeObjectExtensionGroupGroup <em>View Volume Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ViewVolumeTypeImpl#getViewVolumeObjectExtensionGroup <em>View Volume Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewVolumeTypeImpl extends AbstractObjectTypeImpl implements ViewVolumeType {
	/**
	 * The default value of the '{@link #getLeftFov() <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFov()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLeftFov() <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFov()
	 * @generated
	 * @ordered
	 */
	protected double leftFov = LEFT_FOV_EDEFAULT;

	/**
	 * This is true if the Left Fov attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leftFovESet;

	/**
	 * The default value of the '{@link #getRightFov() <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightFov()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRightFov() <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightFov()
	 * @generated
	 * @ordered
	 */
	protected double rightFov = RIGHT_FOV_EDEFAULT;

	/**
	 * This is true if the Right Fov attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rightFovESet;

	/**
	 * The default value of the '{@link #getBottomFov() <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomFov()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottomFov() <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomFov()
	 * @generated
	 * @ordered
	 */
	protected double bottomFov = BOTTOM_FOV_EDEFAULT;

	/**
	 * This is true if the Bottom Fov attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bottomFovESet;

	/**
	 * The default value of the '{@link #getTopFov() <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFov()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_FOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopFov() <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFov()
	 * @generated
	 * @ordered
	 */
	protected double topFov = TOP_FOV_EDEFAULT;

	/**
	 * This is true if the Top Fov attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topFovESet;

	/**
	 * The default value of the '{@link #getNear() <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNear()
	 * @generated
	 * @ordered
	 */
	protected static final double NEAR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNear() <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNear()
	 * @generated
	 * @ordered
	 */
	protected double near = NEAR_EDEFAULT;

	/**
	 * This is true if the Near attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nearESet;

	/**
	 * The cached value of the '{@link #getViewVolumeSimpleExtensionGroupGroup() <em>View Volume Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewVolumeSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap viewVolumeSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getViewVolumeObjectExtensionGroupGroup() <em>View Volume Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewVolumeObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap viewVolumeObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewVolumeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getViewVolumeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLeftFov() {
		return leftFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftFov(double newLeftFov) {
		double oldLeftFov = leftFov;
		leftFov = newLeftFov;
		boolean oldLeftFovESet = leftFovESet;
		leftFovESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VIEW_VOLUME_TYPE__LEFT_FOV, oldLeftFov, leftFov, !oldLeftFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLeftFov() {
		double oldLeftFov = leftFov;
		boolean oldLeftFovESet = leftFovESet;
		leftFov = LEFT_FOV_EDEFAULT;
		leftFovESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VIEW_VOLUME_TYPE__LEFT_FOV, oldLeftFov, LEFT_FOV_EDEFAULT, oldLeftFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLeftFov() {
		return leftFovESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRightFov() {
		return rightFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightFov(double newRightFov) {
		double oldRightFov = rightFov;
		rightFov = newRightFov;
		boolean oldRightFovESet = rightFovESet;
		rightFovESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VIEW_VOLUME_TYPE__RIGHT_FOV, oldRightFov, rightFov, !oldRightFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRightFov() {
		double oldRightFov = rightFov;
		boolean oldRightFovESet = rightFovESet;
		rightFov = RIGHT_FOV_EDEFAULT;
		rightFovESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VIEW_VOLUME_TYPE__RIGHT_FOV, oldRightFov, RIGHT_FOV_EDEFAULT, oldRightFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRightFov() {
		return rightFovESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBottomFov() {
		return bottomFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottomFov(double newBottomFov) {
		double oldBottomFov = bottomFov;
		bottomFov = newBottomFov;
		boolean oldBottomFovESet = bottomFovESet;
		bottomFovESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VIEW_VOLUME_TYPE__BOTTOM_FOV, oldBottomFov, bottomFov, !oldBottomFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBottomFov() {
		double oldBottomFov = bottomFov;
		boolean oldBottomFovESet = bottomFovESet;
		bottomFov = BOTTOM_FOV_EDEFAULT;
		bottomFovESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VIEW_VOLUME_TYPE__BOTTOM_FOV, oldBottomFov, BOTTOM_FOV_EDEFAULT, oldBottomFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBottomFov() {
		return bottomFovESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTopFov() {
		return topFov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopFov(double newTopFov) {
		double oldTopFov = topFov;
		topFov = newTopFov;
		boolean oldTopFovESet = topFovESet;
		topFovESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VIEW_VOLUME_TYPE__TOP_FOV, oldTopFov, topFov, !oldTopFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTopFov() {
		double oldTopFov = topFov;
		boolean oldTopFovESet = topFovESet;
		topFov = TOP_FOV_EDEFAULT;
		topFovESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VIEW_VOLUME_TYPE__TOP_FOV, oldTopFov, TOP_FOV_EDEFAULT, oldTopFovESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTopFov() {
		return topFovESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNear() {
		return near;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNear(double newNear) {
		double oldNear = near;
		near = newNear;
		boolean oldNearESet = nearESet;
		nearESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.VIEW_VOLUME_TYPE__NEAR, oldNear, near, !oldNearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNear() {
		double oldNear = near;
		boolean oldNearESet = nearESet;
		near = NEAR_EDEFAULT;
		nearESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.VIEW_VOLUME_TYPE__NEAR, oldNear, NEAR_EDEFAULT, oldNearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNear() {
		return nearESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getViewVolumeSimpleExtensionGroupGroup() {
		if (viewVolumeSimpleExtensionGroupGroup == null) {
			viewVolumeSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return viewVolumeSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getViewVolumeSimpleExtensionGroup() {
		return getViewVolumeSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getViewVolumeType_ViewVolumeSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getViewVolumeObjectExtensionGroupGroup() {
		if (viewVolumeObjectExtensionGroupGroup == null) {
			viewVolumeObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return viewVolumeObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getViewVolumeObjectExtensionGroup() {
		return getViewVolumeObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getViewVolumeType_ViewVolumeObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getViewVolumeSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getViewVolumeObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getViewVolumeObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.VIEW_VOLUME_TYPE__LEFT_FOV:
				return getLeftFov();
			case KMLPackage.VIEW_VOLUME_TYPE__RIGHT_FOV:
				return getRightFov();
			case KMLPackage.VIEW_VOLUME_TYPE__BOTTOM_FOV:
				return getBottomFov();
			case KMLPackage.VIEW_VOLUME_TYPE__TOP_FOV:
				return getTopFov();
			case KMLPackage.VIEW_VOLUME_TYPE__NEAR:
				return getNear();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getViewVolumeSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getViewVolumeSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP:
				return getViewVolumeSimpleExtensionGroup();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getViewVolumeObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getViewVolumeObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP:
				return getViewVolumeObjectExtensionGroup();
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
			case KMLPackage.VIEW_VOLUME_TYPE__LEFT_FOV:
				setLeftFov((Double)newValue);
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__RIGHT_FOV:
				setRightFov((Double)newValue);
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__BOTTOM_FOV:
				setBottomFov((Double)newValue);
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__TOP_FOV:
				setTopFov((Double)newValue);
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__NEAR:
				setNear((Double)newValue);
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getViewVolumeSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getViewVolumeObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.VIEW_VOLUME_TYPE__LEFT_FOV:
				unsetLeftFov();
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__RIGHT_FOV:
				unsetRightFov();
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__BOTTOM_FOV:
				unsetBottomFov();
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__TOP_FOV:
				unsetTopFov();
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__NEAR:
				unsetNear();
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_GROUP:
				getViewVolumeSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP_GROUP:
				getViewVolumeObjectExtensionGroupGroup().clear();
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
			case KMLPackage.VIEW_VOLUME_TYPE__LEFT_FOV:
				return isSetLeftFov();
			case KMLPackage.VIEW_VOLUME_TYPE__RIGHT_FOV:
				return isSetRightFov();
			case KMLPackage.VIEW_VOLUME_TYPE__BOTTOM_FOV:
				return isSetBottomFov();
			case KMLPackage.VIEW_VOLUME_TYPE__TOP_FOV:
				return isSetTopFov();
			case KMLPackage.VIEW_VOLUME_TYPE__NEAR:
				return isSetNear();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_GROUP:
				return viewVolumeSimpleExtensionGroupGroup != null && !viewVolumeSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP:
				return !getViewVolumeSimpleExtensionGroup().isEmpty();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP_GROUP:
				return viewVolumeObjectExtensionGroupGroup != null && !viewVolumeObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP:
				return !getViewVolumeObjectExtensionGroup().isEmpty();
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
		result.append(" (leftFov: ");
		if (leftFovESet) result.append(leftFov); else result.append("<unset>");
		result.append(", rightFov: ");
		if (rightFovESet) result.append(rightFov); else result.append("<unset>");
		result.append(", bottomFov: ");
		if (bottomFovESet) result.append(bottomFov); else result.append("<unset>");
		result.append(", topFov: ");
		if (topFovESet) result.append(topFov); else result.append("<unset>");
		result.append(", near: ");
		if (nearESet) result.append(near); else result.append("<unset>");
		result.append(", viewVolumeSimpleExtensionGroupGroup: ");
		result.append(viewVolumeSimpleExtensionGroupGroup);
		result.append(", viewVolumeObjectExtensionGroupGroup: ");
		result.append(viewVolumeObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ViewVolumeTypeImpl
