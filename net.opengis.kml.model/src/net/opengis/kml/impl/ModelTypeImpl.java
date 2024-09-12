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
import net.opengis.kml.LinkType;
import net.opengis.kml.LocationType;
import net.opengis.kml.ModelType;
import net.opengis.kml.OrientationType;
import net.opengis.kml.ResourceMapType;
import net.opengis.kml.ScaleType;

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
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getResourceMap <em>Resource Map</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getModelSimpleExtensionGroupGroup <em>Model Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getModelSimpleExtensionGroup <em>Model Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getModelObjectExtensionGroupGroup <em>Model Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ModelTypeImpl#getModelObjectExtensionGroup <em>Model Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelTypeImpl extends AbstractGeometryTypeImpl implements ModelType {
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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationType location;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType orientation;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected ScaleType scale;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected LinkType link;

	/**
	 * The cached value of the '{@link #getResourceMap() <em>Resource Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMap()
	 * @generated
	 * @ordered
	 */
	protected ResourceMapType resourceMap;

	/**
	 * The cached value of the '{@link #getModelSimpleExtensionGroupGroup() <em>Model Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap modelSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getModelObjectExtensionGroupGroup() <em>Model Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap modelObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAltitudeModeGroupGroup() {
		if (altitudeModeGroupGroup == null) {
			altitudeModeGroupGroup = new BasicFeatureMap(this, KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP_GROUP);
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
		return (EObject)getAltitudeModeGroupGroup().get(KMLPackage.eINSTANCE.getModelType_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).basicAdd(KMLPackage.eINSTANCE.getModelType_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		LocationType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(LocationType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType newOrientation, NotificationChain msgs) {
		OrientationType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__ORIENTATION, oldOrientation, newOrientation);
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
	public void setOrientation(OrientationType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScaleType getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(ScaleType newScale, NotificationChain msgs) {
		ScaleType oldScale = scale;
		scale = newScale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__SCALE, oldScale, newScale);
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
	public void setScale(ScaleType newScale) {
		if (newScale != scale) {
			NotificationChain msgs = null;
			if (scale != null)
				msgs = ((InternalEObject)scale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__SCALE, null, msgs);
			if (newScale != null)
				msgs = ((InternalEObject)newScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__SCALE, null, msgs);
			msgs = basicSetScale(newScale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__SCALE, newScale, newScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		LinkType oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__LINK, oldLink, newLink);
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
	public void setLink(LinkType newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__LINK, null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__LINK, null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMapType getResourceMap() {
		return resourceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceMap(ResourceMapType newResourceMap, NotificationChain msgs) {
		ResourceMapType oldResourceMap = resourceMap;
		resourceMap = newResourceMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__RESOURCE_MAP, oldResourceMap, newResourceMap);
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
	public void setResourceMap(ResourceMapType newResourceMap) {
		if (newResourceMap != resourceMap) {
			NotificationChain msgs = null;
			if (resourceMap != null)
				msgs = ((InternalEObject)resourceMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__RESOURCE_MAP, null, msgs);
			if (newResourceMap != null)
				msgs = ((InternalEObject)newResourceMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.MODEL_TYPE__RESOURCE_MAP, null, msgs);
			msgs = basicSetResourceMap(newResourceMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.MODEL_TYPE__RESOURCE_MAP, newResourceMap, newResourceMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getModelSimpleExtensionGroupGroup() {
		if (modelSimpleExtensionGroupGroup == null) {
			modelSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return modelSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getModelSimpleExtensionGroup() {
		return getModelSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getModelType_ModelSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getModelObjectExtensionGroupGroup() {
		if (modelObjectExtensionGroupGroup == null) {
			modelObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return modelObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getModelObjectExtensionGroup() {
		return getModelObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getModelType_ModelObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return ((InternalEList<?>)getAltitudeModeGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.MODEL_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
			case KMLPackage.MODEL_TYPE__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case KMLPackage.MODEL_TYPE__SCALE:
				return basicSetScale(null, msgs);
			case KMLPackage.MODEL_TYPE__LINK:
				return basicSetLink(null, msgs);
			case KMLPackage.MODEL_TYPE__RESOURCE_MAP:
				return basicSetResourceMap(null, msgs);
			case KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getModelSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getModelObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getModelObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				if (coreType) return getAltitudeModeGroupGroup();
				return ((FeatureMap.Internal)getAltitudeModeGroupGroup()).getWrapper();
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.MODEL_TYPE__LOCATION:
				return getLocation();
			case KMLPackage.MODEL_TYPE__ORIENTATION:
				return getOrientation();
			case KMLPackage.MODEL_TYPE__SCALE:
				return getScale();
			case KMLPackage.MODEL_TYPE__LINK:
				return getLink();
			case KMLPackage.MODEL_TYPE__RESOURCE_MAP:
				return getResourceMap();
			case KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getModelSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getModelSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP:
				return getModelSimpleExtensionGroup();
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getModelObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getModelObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP:
				return getModelObjectExtensionGroup();
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
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				((FeatureMap.Internal)getAltitudeModeGroupGroup()).set(newValue);
				return;
			case KMLPackage.MODEL_TYPE__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case KMLPackage.MODEL_TYPE__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case KMLPackage.MODEL_TYPE__SCALE:
				setScale((ScaleType)newValue);
				return;
			case KMLPackage.MODEL_TYPE__LINK:
				setLink((LinkType)newValue);
				return;
			case KMLPackage.MODEL_TYPE__RESOURCE_MAP:
				setResourceMap((ResourceMapType)newValue);
				return;
			case KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getModelSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getModelObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				getAltitudeModeGroupGroup().clear();
				return;
			case KMLPackage.MODEL_TYPE__LOCATION:
				setLocation((LocationType)null);
				return;
			case KMLPackage.MODEL_TYPE__ORIENTATION:
				setOrientation((OrientationType)null);
				return;
			case KMLPackage.MODEL_TYPE__SCALE:
				setScale((ScaleType)null);
				return;
			case KMLPackage.MODEL_TYPE__LINK:
				setLink((LinkType)null);
				return;
			case KMLPackage.MODEL_TYPE__RESOURCE_MAP:
				setResourceMap((ResourceMapType)null);
				return;
			case KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP_GROUP:
				getModelSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP_GROUP:
				getModelObjectExtensionGroupGroup().clear();
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
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP_GROUP:
				return altitudeModeGroupGroup != null && !altitudeModeGroupGroup.isEmpty();
			case KMLPackage.MODEL_TYPE__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.MODEL_TYPE__LOCATION:
				return location != null;
			case KMLPackage.MODEL_TYPE__ORIENTATION:
				return orientation != null;
			case KMLPackage.MODEL_TYPE__SCALE:
				return scale != null;
			case KMLPackage.MODEL_TYPE__LINK:
				return link != null;
			case KMLPackage.MODEL_TYPE__RESOURCE_MAP:
				return resourceMap != null;
			case KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP_GROUP:
				return modelSimpleExtensionGroupGroup != null && !modelSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP:
				return !getModelSimpleExtensionGroup().isEmpty();
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP_GROUP:
				return modelObjectExtensionGroupGroup != null && !modelObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP:
				return !getModelObjectExtensionGroup().isEmpty();
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
		result.append(" (altitudeModeGroupGroup: ");
		result.append(altitudeModeGroupGroup);
		result.append(", modelSimpleExtensionGroupGroup: ");
		result.append(modelSimpleExtensionGroupGroup);
		result.append(", modelObjectExtensionGroupGroup: ");
		result.append(modelObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl
