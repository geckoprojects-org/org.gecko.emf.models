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

import java.util.List;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.PointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#getPointSimpleExtensionGroupGroup <em>Point Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#getPointSimpleExtensionGroup <em>Point Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#getPointObjectExtensionGroupGroup <em>Point Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PointTypeImpl#getPointObjectExtensionGroup <em>Point Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointTypeImpl extends AbstractGeometryTypeImpl implements PointType {
	/**
	 * The default value of the '{@link #isExtrude() <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTRUDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtrude() <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrude()
	 * @generated
	 * @ordered
	 */
	protected boolean extrude = EXTRUDE_EDEFAULT;

	/**
	 * This is true if the Extrude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrudeESet;

	/**
	 * The cached value of the '{@link #getAltitudeModeGroupGroup() <em>Altitude Mode Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeModeGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap altitudeModeGroupGroup;

	/**
	 * The default value of the '{@link #getCoordinates() <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> COORDINATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected List<String> coordinates = COORDINATES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPointSimpleExtensionGroupGroup() <em>Point Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap pointSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getPointObjectExtensionGroupGroup() <em>Point Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap pointObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExtrude() {
		return extrude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtrude(boolean newExtrude) {
		boolean oldExtrude = extrude;
		extrude = newExtrude;
		boolean oldExtrudeESet = extrudeESet;
		extrudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.POINT_TYPE__EXTRUDE, oldExtrude, extrude, !oldExtrudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExtrude() {
		boolean oldExtrude = extrude;
		boolean oldExtrudeESet = extrudeESet;
		extrude = EXTRUDE_EDEFAULT;
		extrudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.POINT_TYPE__EXTRUDE, oldExtrude, EXTRUDE_EDEFAULT, oldExtrudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExtrude() {
		return extrudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAltitudeModeGroupGroup() {
		if (altitudeModeGroupGroup == null) {
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP_GROUP);
		}
		return altitudeModeGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAltitudeModeGroup() {
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getPointType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getPointType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinates(List<String> newCoordinates) {
		List<String> oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.POINT_TYPE__COORDINATES, oldCoordinates, coordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPointSimpleExtensionGroupGroup() {
		if (pointSimpleExtensionGroupGroup == null) {
			pointSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return pointSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getPointSimpleExtensionGroup() {
		return getPointSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPointType_PointSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPointObjectExtensionGroupGroup() {
		if (pointObjectExtensionGroupGroup == null) {
			pointObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return pointObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getPointObjectExtensionGroup() {
		return getPointObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPointType_PointObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPointSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPointObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getPointObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.POINT_TYPE__EXTRUDE:
				return isExtrude();
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.POINT_TYPE__COORDINATES:
				return getCoordinates();
			case KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getPointSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getPointSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP:
				return getPointSimpleExtensionGroup();
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getPointObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getPointObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP:
				return getPointObjectExtensionGroup();
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
			case KMLPackage.POINT_TYPE__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.POINT_TYPE__COORDINATES:
				setCoordinates((List<String>)newValue);
				return;
			case KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPointSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPointObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.POINT_TYPE__EXTRUDE:
				unsetExtrude();
				return;
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.POINT_TYPE__COORDINATES:
				setCoordinates(COORDINATES_EDEFAULT);
				return;
			case KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP_GROUP:
				getPointSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP_GROUP:
				getPointObjectExtensionGroupGroup().clear();
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
			case KMLPackage.POINT_TYPE__EXTRUDE:
				return isSetExtrude();
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.POINT_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.POINT_TYPE__COORDINATES:
				return COORDINATES_EDEFAULT == null ? coordinates != null : !COORDINATES_EDEFAULT.equals(coordinates);
			case KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP_GROUP:
				return pointSimpleExtensionGroupGroup != null && !pointSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP:
				return !getPointSimpleExtensionGroup().isEmpty();
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP_GROUP:
				return pointObjectExtensionGroupGroup != null && !pointObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP:
				return !getPointObjectExtensionGroup().isEmpty();
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
		result.append(" (extrude: ");
		if (extrudeESet) result.append(extrude); else result.append("<unset>");
		result.append(", altitudeModeGroupGroup: ");
		result.append(altitudeModeGroupGroup);
		result.append(", coordinates: ");
		result.append(coordinates);
		result.append(", pointSimpleExtensionGroupGroup: ");
		result.append(pointSimpleExtensionGroupGroup);
		result.append(", pointObjectExtensionGroupGroup: ");
		result.append(pointObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //PointTypeImpl
