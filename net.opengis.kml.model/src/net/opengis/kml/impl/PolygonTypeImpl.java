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

import java.util.Collection;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.BoundaryType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.PolygonType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getOuterBoundaryIs <em>Outer Boundary Is</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getInnerBoundaryIs <em>Inner Boundary Is</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getPolygonSimpleExtensionGroupGroup <em>Polygon Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getPolygonSimpleExtensionGroup <em>Polygon Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getPolygonObjectExtensionGroupGroup <em>Polygon Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolygonTypeImpl#getPolygonObjectExtensionGroup <em>Polygon Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonTypeImpl extends AbstractGeometryTypeImpl implements PolygonType {
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
	 * The cached value of the '{@link #getOuterBoundaryIs() <em>Outer Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundaryIs()
	 * @generated
	 * @ordered
	 */
	protected BoundaryType outerBoundaryIs;

	/**
	 * The cached value of the '{@link #getInnerBoundaryIs() <em>Inner Boundary Is</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaryIs()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundaryType> innerBoundaryIs;

	/**
	 * The cached value of the '{@link #getPolygonSimpleExtensionGroupGroup() <em>Polygon Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap polygonSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getPolygonObjectExtensionGroupGroup() <em>Polygon Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap polygonObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getPolygonType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.POLYGON_TYPE__EXTRUDE, oldExtrude, extrude, !oldExtrudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.POLYGON_TYPE__EXTRUDE, oldExtrude, EXTRUDE_EDEFAULT, oldExtrudeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.POLYGON_TYPE__TESSELLATE, oldTessellate, tessellate, !oldTessellateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.POLYGON_TYPE__TESSELLATE, oldTessellate, TESSELLATE_EDEFAULT, oldTessellateESet));
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
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP_GROUP);
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
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getPolygonType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getPolygonType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryType getOuterBoundaryIs() {
		return outerBoundaryIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundaryIs(BoundaryType newOuterBoundaryIs, NotificationChain msgs) {
		BoundaryType oldOuterBoundaryIs = outerBoundaryIs;
		outerBoundaryIs = newOuterBoundaryIs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS, oldOuterBoundaryIs, newOuterBoundaryIs);
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
	public void setOuterBoundaryIs(BoundaryType newOuterBoundaryIs) {
		if (newOuterBoundaryIs != outerBoundaryIs) {
			NotificationChain msgs = null;
			if (outerBoundaryIs != null)
				msgs = ((InternalEObject)outerBoundaryIs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS, null, msgs);
			if (newOuterBoundaryIs != null)
				msgs = ((InternalEObject)newOuterBoundaryIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS, null, msgs);
			msgs = basicSetOuterBoundaryIs(newOuterBoundaryIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS, newOuterBoundaryIs, newOuterBoundaryIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundaryType> getInnerBoundaryIs() {
		if (innerBoundaryIs == null) {
			innerBoundaryIs = new EObjectContainmentEList<BoundaryType>(BoundaryType.class, this, KMLPackage.POLYGON_TYPE__INNER_BOUNDARY_IS);
		}
		return innerBoundaryIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPolygonSimpleExtensionGroupGroup() {
		if (polygonSimpleExtensionGroupGroup == null) {
			polygonSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return polygonSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getPolygonSimpleExtensionGroup() {
		return getPolygonSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPolygonType_PolygonSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPolygonObjectExtensionGroupGroup() {
		if (polygonObjectExtensionGroupGroup == null) {
			polygonObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return polygonObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getPolygonObjectExtensionGroup() {
		return getPolygonObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPolygonType_PolygonObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				return basicSetOuterBoundaryIs(null, msgs);
			case KMLPackage.POLYGON_TYPE__INNER_BOUNDARY_IS:
				return ((InternalEList<?>)getInnerBoundaryIs()).basicRemove(otherEnd, msgs);
			case KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPolygonSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPolygonObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getPolygonObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.POLYGON_TYPE__EXTRUDE:
				return isExtrude();
			case KMLPackage.POLYGON_TYPE__TESSELLATE:
				return isTessellate();
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				return getOuterBoundaryIs();
			case KMLPackage.POLYGON_TYPE__INNER_BOUNDARY_IS:
				return getInnerBoundaryIs();
			case KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getPolygonSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getPolygonSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP:
				return getPolygonSimpleExtensionGroup();
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getPolygonObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getPolygonObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP:
				return getPolygonObjectExtensionGroup();
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
			case KMLPackage.POLYGON_TYPE__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case KMLPackage.POLYGON_TYPE__TESSELLATE:
				setTessellate((Boolean)newValue);
				return;
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((BoundaryType)newValue);
				return;
			case KMLPackage.POLYGON_TYPE__INNER_BOUNDARY_IS:
				getInnerBoundaryIs().clear();
				getInnerBoundaryIs().addAll((Collection<? extends BoundaryType>)newValue);
				return;
			case KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPolygonSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPolygonObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.POLYGON_TYPE__EXTRUDE:
				unsetExtrude();
				return;
			case KMLPackage.POLYGON_TYPE__TESSELLATE:
				unsetTessellate();
				return;
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((BoundaryType)null);
				return;
			case KMLPackage.POLYGON_TYPE__INNER_BOUNDARY_IS:
				getInnerBoundaryIs().clear();
				return;
			case KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP_GROUP:
				getPolygonSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP_GROUP:
				getPolygonObjectExtensionGroupGroup().clear();
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
			case KMLPackage.POLYGON_TYPE__EXTRUDE:
				return isSetExtrude();
			case KMLPackage.POLYGON_TYPE__TESSELLATE:
				return isSetTessellate();
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.POLYGON_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				return outerBoundaryIs != null;
			case KMLPackage.POLYGON_TYPE__INNER_BOUNDARY_IS:
				return innerBoundaryIs != null && !innerBoundaryIs.isEmpty();
			case KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP_GROUP:
				return polygonSimpleExtensionGroupGroup != null && !polygonSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP:
				return !getPolygonSimpleExtensionGroup().isEmpty();
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP_GROUP:
				return polygonObjectExtensionGroupGroup != null && !polygonObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP:
				return !getPolygonObjectExtensionGroup().isEmpty();
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
		result.append(", polygonSimpleExtensionGroupGroup: ");
		result.append(polygonSimpleExtensionGroupGroup);
		result.append(", polygonObjectExtensionGroupGroup: ");
		result.append(polygonObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //PolygonTypeImpl
