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
import net.opengis.kml.LinearRingType;

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
 * An implementation of the model object '<em><b>Linear Ring Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#getLinearRingSimpleExtensionGroupGroup <em>Linear Ring Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#getLinearRingSimpleExtensionGroup <em>Linear Ring Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#getLinearRingObjectExtensionGroupGroup <em>Linear Ring Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LinearRingTypeImpl#getLinearRingObjectExtensionGroup <em>Linear Ring Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearRingTypeImpl extends AbstractGeometryTypeImpl implements LinearRingType {
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
	 * The default value of the '{@link #isTessellate() <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTessellate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TESSELLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTessellate() <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTessellate()
	 * @generated
	 * @ordered
	 */
	protected boolean tessellate = TESSELLATE_EDEFAULT;

	/**
	 * This is true if the Tessellate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tessellateESet;

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
	 * The cached value of the '{@link #getLinearRingSimpleExtensionGroupGroup() <em>Linear Ring Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearRingSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap linearRingSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLinearRingObjectExtensionGroupGroup() <em>Linear Ring Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearRingObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap linearRingObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearRingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLinearRingType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINEAR_RING_TYPE__EXTRUDE, oldExtrude, extrude, !oldExtrudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINEAR_RING_TYPE__EXTRUDE, oldExtrude, EXTRUDE_EDEFAULT, oldExtrudeESet));
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
	public boolean isTessellate() {
		return tessellate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTessellate(boolean newTessellate) {
		boolean oldTessellate = tessellate;
		tessellate = newTessellate;
		boolean oldTessellateESet = tessellateESet;
		tessellateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINEAR_RING_TYPE__TESSELLATE, oldTessellate, tessellate, !oldTessellateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTessellate() {
		boolean oldTessellate = tessellate;
		boolean oldTessellateESet = tessellateESet;
		tessellate = TESSELLATE_EDEFAULT;
		tessellateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINEAR_RING_TYPE__TESSELLATE, oldTessellate, TESSELLATE_EDEFAULT, oldTessellateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTessellate() {
		return tessellateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAltitudeModeGroupGroup() {
		if (altitudeModeGroupGroup == null) {
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP_GROUP);
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
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getLinearRingType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getLinearRingType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINEAR_RING_TYPE__COORDINATES, oldCoordinates, coordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLinearRingSimpleExtensionGroupGroup() {
		if (linearRingSimpleExtensionGroupGroup == null) {
			linearRingSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return linearRingSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLinearRingSimpleExtensionGroup() {
		return getLinearRingSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLinearRingType_LinearRingSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLinearRingObjectExtensionGroupGroup() {
		if (linearRingObjectExtensionGroupGroup == null) {
			linearRingObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return linearRingObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLinearRingObjectExtensionGroup() {
		return getLinearRingObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLinearRingType_LinearRingObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLinearRingSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLinearRingObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLinearRingObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LINEAR_RING_TYPE__EXTRUDE:
				return isExtrude();
			case KMLPackage.LINEAR_RING_TYPE__TESSELLATE:
				return isTessellate();
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.LINEAR_RING_TYPE__COORDINATES:
				return getCoordinates();
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLinearRingSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLinearRingSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP:
				return getLinearRingSimpleExtensionGroup();
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLinearRingObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLinearRingObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP:
				return getLinearRingObjectExtensionGroup();
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
			case KMLPackage.LINEAR_RING_TYPE__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case KMLPackage.LINEAR_RING_TYPE__TESSELLATE:
				setTessellate((Boolean)newValue);
				return;
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.LINEAR_RING_TYPE__COORDINATES:
				setCoordinates((List<String>)newValue);
				return;
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLinearRingSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLinearRingObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LINEAR_RING_TYPE__EXTRUDE:
				unsetExtrude();
				return;
			case KMLPackage.LINEAR_RING_TYPE__TESSELLATE:
				unsetTessellate();
				return;
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.LINEAR_RING_TYPE__COORDINATES:
				setCoordinates(COORDINATES_EDEFAULT);
				return;
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP_GROUP:
				getLinearRingSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP_GROUP:
				getLinearRingObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LINEAR_RING_TYPE__EXTRUDE:
				return isSetExtrude();
			case KMLPackage.LINEAR_RING_TYPE__TESSELLATE:
				return isSetTessellate();
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.LINEAR_RING_TYPE__COORDINATES:
				return COORDINATES_EDEFAULT == null ? coordinates != null : !COORDINATES_EDEFAULT.equals(coordinates);
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP_GROUP:
				return linearRingSimpleExtensionGroupGroup != null && !linearRingSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP:
				return !getLinearRingSimpleExtensionGroup().isEmpty();
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP_GROUP:
				return linearRingObjectExtensionGroupGroup != null && !linearRingObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP:
				return !getLinearRingObjectExtensionGroup().isEmpty();
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
		result.append(", tessellate: ");
		if (tessellateESet) result.append(tessellate); else result.append("<unset>");
		result.append(", altitudeModeGroupGroup: ");
		result.append(altitudeModeGroupGroup);
		result.append(", coordinates: ");
		result.append(coordinates);
		result.append(", linearRingSimpleExtensionGroupGroup: ");
		result.append(linearRingSimpleExtensionGroupGroup);
		result.append(", linearRingObjectExtensionGroupGroup: ");
		result.append(linearRingObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LinearRingTypeImpl
