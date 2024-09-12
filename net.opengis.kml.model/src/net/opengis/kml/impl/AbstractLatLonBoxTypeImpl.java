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

import net.opengis.kml.AbstractLatLonBoxType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;

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
 * An implementation of the model object '<em><b>Abstract Lat Lon Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getNorth <em>North</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getSouth <em>South</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getEast <em>East</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getWest <em>West</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getAbstractLatLonBoxSimpleExtensionGroupGroup <em>Abstract Lat Lon Box Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getAbstractLatLonBoxSimpleExtensionGroup <em>Abstract Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getAbstractLatLonBoxObjectExtensionGroupGroup <em>Abstract Lat Lon Box Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl#getAbstractLatLonBoxObjectExtensionGroup <em>Abstract Lat Lon Box Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractLatLonBoxTypeImpl extends AbstractObjectTypeImpl implements AbstractLatLonBoxType {
	/**
	 * The default value of the '{@link #getNorth() <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected static final double NORTH_EDEFAULT = 180.0;

	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected double north = NORTH_EDEFAULT;

	/**
	 * This is true if the North attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean northESet;

	/**
	 * The default value of the '{@link #getSouth() <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected static final double SOUTH_EDEFAULT = -180.0;

	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected double south = SOUTH_EDEFAULT;

	/**
	 * This is true if the South attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean southESet;

	/**
	 * The default value of the '{@link #getEast() <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected static final double EAST_EDEFAULT = 180.0;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected double east = EAST_EDEFAULT;

	/**
	 * This is true if the East attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eastESet;

	/**
	 * The default value of the '{@link #getWest() <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected static final double WEST_EDEFAULT = -180.0;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected double west = WEST_EDEFAULT;

	/**
	 * This is true if the West attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean westESet;

	/**
	 * The cached value of the '{@link #getAbstractLatLonBoxSimpleExtensionGroupGroup() <em>Abstract Lat Lon Box Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractLatLonBoxSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractLatLonBoxSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractLatLonBoxObjectExtensionGroupGroup() <em>Abstract Lat Lon Box Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractLatLonBoxObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractLatLonBoxObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractLatLonBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractLatLonBoxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNorth(double newNorth) {
		double oldNorth = north;
		north = newNorth;
		boolean oldNorthESet = northESet;
		northESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__NORTH, oldNorth, north, !oldNorthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNorth() {
		double oldNorth = north;
		boolean oldNorthESet = northESet;
		north = NORTH_EDEFAULT;
		northESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__NORTH, oldNorth, NORTH_EDEFAULT, oldNorthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNorth() {
		return northESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSouth(double newSouth) {
		double oldSouth = south;
		south = newSouth;
		boolean oldSouthESet = southESet;
		southESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__SOUTH, oldSouth, south, !oldSouthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSouth() {
		double oldSouth = south;
		boolean oldSouthESet = southESet;
		south = SOUTH_EDEFAULT;
		southESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__SOUTH, oldSouth, SOUTH_EDEFAULT, oldSouthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSouth() {
		return southESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEast(double newEast) {
		double oldEast = east;
		east = newEast;
		boolean oldEastESet = eastESet;
		eastESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__EAST, oldEast, east, !oldEastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEast() {
		double oldEast = east;
		boolean oldEastESet = eastESet;
		east = EAST_EDEFAULT;
		eastESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__EAST, oldEast, EAST_EDEFAULT, oldEastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEast() {
		return eastESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWest(double newWest) {
		double oldWest = west;
		west = newWest;
		boolean oldWestESet = westESet;
		westESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__WEST, oldWest, west, !oldWestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWest() {
		double oldWest = west;
		boolean oldWestESet = westESet;
		west = WEST_EDEFAULT;
		westESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__WEST, oldWest, WEST_EDEFAULT, oldWestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWest() {
		return westESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractLatLonBoxSimpleExtensionGroupGroup() {
		if (abstractLatLonBoxSimpleExtensionGroupGroup == null) {
			abstractLatLonBoxSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractLatLonBoxSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractLatLonBoxSimpleExtensionGroup() {
		return getAbstractLatLonBoxSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractLatLonBoxType_AbstractLatLonBoxSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractLatLonBoxObjectExtensionGroupGroup() {
		if (abstractLatLonBoxObjectExtensionGroupGroup == null) {
			abstractLatLonBoxObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractLatLonBoxObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractLatLonBoxObjectExtensionGroup() {
		return getAbstractLatLonBoxObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractLatLonBoxType_AbstractLatLonBoxObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractLatLonBoxSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractLatLonBoxObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractLatLonBoxObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__NORTH:
				return getNorth();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__SOUTH:
				return getSouth();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__EAST:
				return getEast();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__WEST:
				return getWest();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractLatLonBoxSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractLatLonBoxSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return getAbstractLatLonBoxSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractLatLonBoxObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractLatLonBoxObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return getAbstractLatLonBoxObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__NORTH:
				setNorth((Double)newValue);
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__SOUTH:
				setSouth((Double)newValue);
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__EAST:
				setEast((Double)newValue);
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__WEST:
				setWest((Double)newValue);
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractLatLonBoxSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractLatLonBoxObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__NORTH:
				unsetNorth();
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__SOUTH:
				unsetSouth();
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__EAST:
				unsetEast();
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__WEST:
				unsetWest();
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractLatLonBoxSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractLatLonBoxObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__NORTH:
				return isSetNorth();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__SOUTH:
				return isSetSouth();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__EAST:
				return isSetEast();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__WEST:
				return isSetWest();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractLatLonBoxSimpleExtensionGroupGroup != null && !abstractLatLonBoxSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return !getAbstractLatLonBoxSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractLatLonBoxObjectExtensionGroupGroup != null && !abstractLatLonBoxObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return !getAbstractLatLonBoxObjectExtensionGroup().isEmpty();
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
		result.append(" (north: ");
		if (northESet) result.append(north); else result.append("<unset>");
		result.append(", south: ");
		if (southESet) result.append(south); else result.append("<unset>");
		result.append(", east: ");
		if (eastESet) result.append(east); else result.append("<unset>");
		result.append(", west: ");
		if (westESet) result.append(west); else result.append("<unset>");
		result.append(", abstractLatLonBoxSimpleExtensionGroupGroup: ");
		result.append(abstractLatLonBoxSimpleExtensionGroupGroup);
		result.append(", abstractLatLonBoxObjectExtensionGroupGroup: ");
		result.append(abstractLatLonBoxObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractLatLonBoxTypeImpl
