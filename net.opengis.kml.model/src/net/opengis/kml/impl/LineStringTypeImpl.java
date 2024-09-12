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
import net.opengis.kml.LineStringType;

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
 * An implementation of the model object '<em><b>Line String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#getLineStringSimpleExtensionGroupGroup <em>Line String Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#getLineStringSimpleExtensionGroup <em>Line String Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#getLineStringObjectExtensionGroupGroup <em>Line String Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStringTypeImpl#getLineStringObjectExtensionGroup <em>Line String Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineStringTypeImpl extends AbstractGeometryTypeImpl implements LineStringType {
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
	 * The cached value of the '{@link #getLineStringSimpleExtensionGroupGroup() <em>Line String Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStringSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lineStringSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLineStringObjectExtensionGroupGroup() <em>Line String Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStringObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lineStringObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLineStringType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINE_STRING_TYPE__EXTRUDE, oldExtrude, extrude, !oldExtrudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINE_STRING_TYPE__EXTRUDE, oldExtrude, EXTRUDE_EDEFAULT, oldExtrudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINE_STRING_TYPE__TESSELLATE, oldTessellate, tessellate, !oldTessellateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINE_STRING_TYPE__TESSELLATE, oldTessellate, TESSELLATE_EDEFAULT, oldTessellateESet));
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
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP_GROUP);
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
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getLineStringType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getLineStringType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINE_STRING_TYPE__COORDINATES, oldCoordinates, coordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLineStringSimpleExtensionGroupGroup() {
		if (lineStringSimpleExtensionGroupGroup == null) {
			lineStringSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return lineStringSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLineStringSimpleExtensionGroup() {
		return getLineStringSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLineStringType_LineStringSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLineStringObjectExtensionGroupGroup() {
		if (lineStringObjectExtensionGroupGroup == null) {
			lineStringObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return lineStringObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLineStringObjectExtensionGroup() {
		return getLineStringObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLineStringType_LineStringObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLineStringSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLineStringObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLineStringObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LINE_STRING_TYPE__EXTRUDE:
				return isExtrude();
			case KMLPackage.LINE_STRING_TYPE__TESSELLATE:
				return isTessellate();
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.LINE_STRING_TYPE__COORDINATES:
				return getCoordinates();
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLineStringSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLineStringSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP:
				return getLineStringSimpleExtensionGroup();
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLineStringObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLineStringObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP:
				return getLineStringObjectExtensionGroup();
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
			case KMLPackage.LINE_STRING_TYPE__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case KMLPackage.LINE_STRING_TYPE__TESSELLATE:
				setTessellate((Boolean)newValue);
				return;
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.LINE_STRING_TYPE__COORDINATES:
				setCoordinates((List<String>)newValue);
				return;
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLineStringSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLineStringObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LINE_STRING_TYPE__EXTRUDE:
				unsetExtrude();
				return;
			case KMLPackage.LINE_STRING_TYPE__TESSELLATE:
				unsetTessellate();
				return;
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.LINE_STRING_TYPE__COORDINATES:
				setCoordinates(COORDINATES_EDEFAULT);
				return;
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP_GROUP:
				getLineStringSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP_GROUP:
				getLineStringObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LINE_STRING_TYPE__EXTRUDE:
				return isSetExtrude();
			case KMLPackage.LINE_STRING_TYPE__TESSELLATE:
				return isSetTessellate();
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.LINE_STRING_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.LINE_STRING_TYPE__COORDINATES:
				return COORDINATES_EDEFAULT == null ? coordinates != null : !COORDINATES_EDEFAULT.equals(coordinates);
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP_GROUP:
				return lineStringSimpleExtensionGroupGroup != null && !lineStringSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP:
				return !getLineStringSimpleExtensionGroup().isEmpty();
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP_GROUP:
				return lineStringObjectExtensionGroupGroup != null && !lineStringObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP:
				return !getLineStringObjectExtensionGroup().isEmpty();
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
		result.append(", lineStringSimpleExtensionGroupGroup: ");
		result.append(lineStringSimpleExtensionGroupGroup);
		result.append(", lineStringObjectExtensionGroupGroup: ");
		result.append(lineStringObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LineStringTypeImpl
