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
import net.opengis.kml.LodType;

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
 * An implementation of the model object '<em><b>Lod Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getLodSimpleExtensionGroupGroup <em>Lod Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getLodSimpleExtensionGroup <em>Lod Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getLodObjectExtensionGroupGroup <em>Lod Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LodTypeImpl#getLodObjectExtensionGroup <em>Lod Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LodTypeImpl extends AbstractObjectTypeImpl implements LodType {
	/**
	 * The default value of the '{@link #getMinLodPixels() <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_LOD_PIXELS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinLodPixels() <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLodPixels()
	 * @generated
	 * @ordered
	 */
	protected double minLodPixels = MIN_LOD_PIXELS_EDEFAULT;

	/**
	 * This is true if the Min Lod Pixels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minLodPixelsESet;

	/**
	 * The default value of the '{@link #getMaxLodPixels() <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_LOD_PIXELS_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getMaxLodPixels() <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLodPixels()
	 * @generated
	 * @ordered
	 */
	protected double maxLodPixels = MAX_LOD_PIXELS_EDEFAULT;

	/**
	 * This is true if the Max Lod Pixels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxLodPixelsESet;

	/**
	 * The default value of the '{@link #getMinFadeExtent() <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_FADE_EXTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinFadeExtent() <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected double minFadeExtent = MIN_FADE_EXTENT_EDEFAULT;

	/**
	 * This is true if the Min Fade Extent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minFadeExtentESet;

	/**
	 * The default value of the '{@link #getMaxFadeExtent() <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_FADE_EXTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxFadeExtent() <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected double maxFadeExtent = MAX_FADE_EXTENT_EDEFAULT;

	/**
	 * This is true if the Max Fade Extent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxFadeExtentESet;

	/**
	 * The cached value of the '{@link #getLodSimpleExtensionGroupGroup() <em>Lod Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLodSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lodSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLodObjectExtensionGroupGroup() <em>Lod Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLodObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lodObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinLodPixels() {
		return minLodPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLodPixels(double newMinLodPixels) {
		double oldMinLodPixels = minLodPixels;
		minLodPixels = newMinLodPixels;
		boolean oldMinLodPixelsESet = minLodPixelsESet;
		minLodPixelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOD_TYPE__MIN_LOD_PIXELS, oldMinLodPixels, minLodPixels, !oldMinLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinLodPixels() {
		double oldMinLodPixels = minLodPixels;
		boolean oldMinLodPixelsESet = minLodPixelsESet;
		minLodPixels = MIN_LOD_PIXELS_EDEFAULT;
		minLodPixelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOD_TYPE__MIN_LOD_PIXELS, oldMinLodPixels, MIN_LOD_PIXELS_EDEFAULT, oldMinLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinLodPixels() {
		return minLodPixelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxLodPixels() {
		return maxLodPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLodPixels(double newMaxLodPixels) {
		double oldMaxLodPixels = maxLodPixels;
		maxLodPixels = newMaxLodPixels;
		boolean oldMaxLodPixelsESet = maxLodPixelsESet;
		maxLodPixelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOD_TYPE__MAX_LOD_PIXELS, oldMaxLodPixels, maxLodPixels, !oldMaxLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxLodPixels() {
		double oldMaxLodPixels = maxLodPixels;
		boolean oldMaxLodPixelsESet = maxLodPixelsESet;
		maxLodPixels = MAX_LOD_PIXELS_EDEFAULT;
		maxLodPixelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOD_TYPE__MAX_LOD_PIXELS, oldMaxLodPixels, MAX_LOD_PIXELS_EDEFAULT, oldMaxLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxLodPixels() {
		return maxLodPixelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinFadeExtent() {
		return minFadeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinFadeExtent(double newMinFadeExtent) {
		double oldMinFadeExtent = minFadeExtent;
		minFadeExtent = newMinFadeExtent;
		boolean oldMinFadeExtentESet = minFadeExtentESet;
		minFadeExtentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOD_TYPE__MIN_FADE_EXTENT, oldMinFadeExtent, minFadeExtent, !oldMinFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinFadeExtent() {
		double oldMinFadeExtent = minFadeExtent;
		boolean oldMinFadeExtentESet = minFadeExtentESet;
		minFadeExtent = MIN_FADE_EXTENT_EDEFAULT;
		minFadeExtentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOD_TYPE__MIN_FADE_EXTENT, oldMinFadeExtent, MIN_FADE_EXTENT_EDEFAULT, oldMinFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinFadeExtent() {
		return minFadeExtentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxFadeExtent() {
		return maxFadeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxFadeExtent(double newMaxFadeExtent) {
		double oldMaxFadeExtent = maxFadeExtent;
		maxFadeExtent = newMaxFadeExtent;
		boolean oldMaxFadeExtentESet = maxFadeExtentESet;
		maxFadeExtentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LOD_TYPE__MAX_FADE_EXTENT, oldMaxFadeExtent, maxFadeExtent, !oldMaxFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxFadeExtent() {
		double oldMaxFadeExtent = maxFadeExtent;
		boolean oldMaxFadeExtentESet = maxFadeExtentESet;
		maxFadeExtent = MAX_FADE_EXTENT_EDEFAULT;
		maxFadeExtentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LOD_TYPE__MAX_FADE_EXTENT, oldMaxFadeExtent, MAX_FADE_EXTENT_EDEFAULT, oldMaxFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxFadeExtent() {
		return maxFadeExtentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLodSimpleExtensionGroupGroup() {
		if (lodSimpleExtensionGroupGroup == null) {
			lodSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return lodSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLodSimpleExtensionGroup() {
		return getLodSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLodType_LodSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLodObjectExtensionGroupGroup() {
		if (lodObjectExtensionGroupGroup == null) {
			lodObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return lodObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLodObjectExtensionGroup() {
		return getLodObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLodType_LodObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLodSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLodObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLodObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LOD_TYPE__MIN_LOD_PIXELS:
				return getMinLodPixels();
			case KMLPackage.LOD_TYPE__MAX_LOD_PIXELS:
				return getMaxLodPixels();
			case KMLPackage.LOD_TYPE__MIN_FADE_EXTENT:
				return getMinFadeExtent();
			case KMLPackage.LOD_TYPE__MAX_FADE_EXTENT:
				return getMaxFadeExtent();
			case KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLodSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLodSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP:
				return getLodSimpleExtensionGroup();
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLodObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLodObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP:
				return getLodObjectExtensionGroup();
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
			case KMLPackage.LOD_TYPE__MIN_LOD_PIXELS:
				setMinLodPixels((Double)newValue);
				return;
			case KMLPackage.LOD_TYPE__MAX_LOD_PIXELS:
				setMaxLodPixels((Double)newValue);
				return;
			case KMLPackage.LOD_TYPE__MIN_FADE_EXTENT:
				setMinFadeExtent((Double)newValue);
				return;
			case KMLPackage.LOD_TYPE__MAX_FADE_EXTENT:
				setMaxFadeExtent((Double)newValue);
				return;
			case KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLodSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLodObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LOD_TYPE__MIN_LOD_PIXELS:
				unsetMinLodPixels();
				return;
			case KMLPackage.LOD_TYPE__MAX_LOD_PIXELS:
				unsetMaxLodPixels();
				return;
			case KMLPackage.LOD_TYPE__MIN_FADE_EXTENT:
				unsetMinFadeExtent();
				return;
			case KMLPackage.LOD_TYPE__MAX_FADE_EXTENT:
				unsetMaxFadeExtent();
				return;
			case KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP_GROUP:
				getLodSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP_GROUP:
				getLodObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LOD_TYPE__MIN_LOD_PIXELS:
				return isSetMinLodPixels();
			case KMLPackage.LOD_TYPE__MAX_LOD_PIXELS:
				return isSetMaxLodPixels();
			case KMLPackage.LOD_TYPE__MIN_FADE_EXTENT:
				return isSetMinFadeExtent();
			case KMLPackage.LOD_TYPE__MAX_FADE_EXTENT:
				return isSetMaxFadeExtent();
			case KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP_GROUP:
				return lodSimpleExtensionGroupGroup != null && !lodSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP:
				return !getLodSimpleExtensionGroup().isEmpty();
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP_GROUP:
				return lodObjectExtensionGroupGroup != null && !lodObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP:
				return !getLodObjectExtensionGroup().isEmpty();
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
		result.append(" (minLodPixels: ");
		if (minLodPixelsESet) result.append(minLodPixels); else result.append("<unset>");
		result.append(", maxLodPixels: ");
		if (maxLodPixelsESet) result.append(maxLodPixels); else result.append("<unset>");
		result.append(", minFadeExtent: ");
		if (minFadeExtentESet) result.append(minFadeExtent); else result.append("<unset>");
		result.append(", maxFadeExtent: ");
		if (maxFadeExtentESet) result.append(maxFadeExtent); else result.append("<unset>");
		result.append(", lodSimpleExtensionGroupGroup: ");
		result.append(lodSimpleExtensionGroupGroup);
		result.append(", lodObjectExtensionGroupGroup: ");
		result.append(lodObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LodTypeImpl
