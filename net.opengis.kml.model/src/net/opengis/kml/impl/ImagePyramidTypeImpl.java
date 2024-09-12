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
import net.opengis.kml.GridOriginEnumType;
import net.opengis.kml.ImagePyramidType;
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
 * An implementation of the model object '<em><b>Image Pyramid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getTileSize <em>Tile Size</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getGridOrigin <em>Grid Origin</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getImagePyramidSimpleExtensionGroupGroup <em>Image Pyramid Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getImagePyramidSimpleExtensionGroup <em>Image Pyramid Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getImagePyramidObjectExtensionGroupGroup <em>Image Pyramid Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ImagePyramidTypeImpl#getImagePyramidObjectExtensionGroup <em>Image Pyramid Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagePyramidTypeImpl extends AbstractObjectTypeImpl implements ImagePyramidType {
	/**
	 * The default value of the '{@link #getTileSize() <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int TILE_SIZE_EDEFAULT = 256;

	/**
	 * The cached value of the '{@link #getTileSize() <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSize()
	 * @generated
	 * @ordered
	 */
	protected int tileSize = TILE_SIZE_EDEFAULT;

	/**
	 * This is true if the Tile Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tileSizeESet;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected int maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * This is true if the Max Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxWidthESet;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected int maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Max Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxHeightESet;

	/**
	 * The default value of the '{@link #getGridOrigin() <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final GridOriginEnumType GRID_ORIGIN_EDEFAULT = GridOriginEnumType.LOWER_LEFT;

	/**
	 * The cached value of the '{@link #getGridOrigin() <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridOrigin()
	 * @generated
	 * @ordered
	 */
	protected GridOriginEnumType gridOrigin = GRID_ORIGIN_EDEFAULT;

	/**
	 * This is true if the Grid Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gridOriginESet;

	/**
	 * The cached value of the '{@link #getImagePyramidSimpleExtensionGroupGroup() <em>Image Pyramid Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePyramidSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap imagePyramidSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getImagePyramidObjectExtensionGroupGroup() <em>Image Pyramid Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePyramidObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap imagePyramidObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagePyramidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getImagePyramidType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTileSize() {
		return tileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileSize(int newTileSize) {
		int oldTileSize = tileSize;
		tileSize = newTileSize;
		boolean oldTileSizeESet = tileSizeESet;
		tileSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.IMAGE_PYRAMID_TYPE__TILE_SIZE, oldTileSize, tileSize, !oldTileSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTileSize() {
		int oldTileSize = tileSize;
		boolean oldTileSizeESet = tileSizeESet;
		tileSize = TILE_SIZE_EDEFAULT;
		tileSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.IMAGE_PYRAMID_TYPE__TILE_SIZE, oldTileSize, TILE_SIZE_EDEFAULT, oldTileSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTileSize() {
		return tileSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWidth(int newMaxWidth) {
		int oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		boolean oldMaxWidthESet = maxWidthESet;
		maxWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.IMAGE_PYRAMID_TYPE__MAX_WIDTH, oldMaxWidth, maxWidth, !oldMaxWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxWidth() {
		int oldMaxWidth = maxWidth;
		boolean oldMaxWidthESet = maxWidthESet;
		maxWidth = MAX_WIDTH_EDEFAULT;
		maxWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.IMAGE_PYRAMID_TYPE__MAX_WIDTH, oldMaxWidth, MAX_WIDTH_EDEFAULT, oldMaxWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxWidth() {
		return maxWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHeight(int newMaxHeight) {
		int oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		boolean oldMaxHeightESet = maxHeightESet;
		maxHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.IMAGE_PYRAMID_TYPE__MAX_HEIGHT, oldMaxHeight, maxHeight, !oldMaxHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxHeight() {
		int oldMaxHeight = maxHeight;
		boolean oldMaxHeightESet = maxHeightESet;
		maxHeight = MAX_HEIGHT_EDEFAULT;
		maxHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.IMAGE_PYRAMID_TYPE__MAX_HEIGHT, oldMaxHeight, MAX_HEIGHT_EDEFAULT, oldMaxHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxHeight() {
		return maxHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridOriginEnumType getGridOrigin() {
		return gridOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGridOrigin(GridOriginEnumType newGridOrigin) {
		GridOriginEnumType oldGridOrigin = gridOrigin;
		gridOrigin = newGridOrigin == null ? GRID_ORIGIN_EDEFAULT : newGridOrigin;
		boolean oldGridOriginESet = gridOriginESet;
		gridOriginESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.IMAGE_PYRAMID_TYPE__GRID_ORIGIN, oldGridOrigin, gridOrigin, !oldGridOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGridOrigin() {
		GridOriginEnumType oldGridOrigin = gridOrigin;
		boolean oldGridOriginESet = gridOriginESet;
		gridOrigin = GRID_ORIGIN_EDEFAULT;
		gridOriginESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.IMAGE_PYRAMID_TYPE__GRID_ORIGIN, oldGridOrigin, GRID_ORIGIN_EDEFAULT, oldGridOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGridOrigin() {
		return gridOriginESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getImagePyramidSimpleExtensionGroupGroup() {
		if (imagePyramidSimpleExtensionGroupGroup == null) {
			imagePyramidSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return imagePyramidSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getImagePyramidSimpleExtensionGroup() {
		return getImagePyramidSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getImagePyramidType_ImagePyramidSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getImagePyramidObjectExtensionGroupGroup() {
		if (imagePyramidObjectExtensionGroupGroup == null) {
			imagePyramidObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return imagePyramidObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getImagePyramidObjectExtensionGroup() {
		return getImagePyramidObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getImagePyramidType_ImagePyramidObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getImagePyramidSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getImagePyramidObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getImagePyramidObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.IMAGE_PYRAMID_TYPE__TILE_SIZE:
				return getTileSize();
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_WIDTH:
				return getMaxWidth();
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_HEIGHT:
				return getMaxHeight();
			case KMLPackage.IMAGE_PYRAMID_TYPE__GRID_ORIGIN:
				return getGridOrigin();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getImagePyramidSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getImagePyramidSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP:
				return getImagePyramidSimpleExtensionGroup();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getImagePyramidObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getImagePyramidObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP:
				return getImagePyramidObjectExtensionGroup();
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
			case KMLPackage.IMAGE_PYRAMID_TYPE__TILE_SIZE:
				setTileSize((Integer)newValue);
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_WIDTH:
				setMaxWidth((Integer)newValue);
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_HEIGHT:
				setMaxHeight((Integer)newValue);
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__GRID_ORIGIN:
				setGridOrigin((GridOriginEnumType)newValue);
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getImagePyramidSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getImagePyramidObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.IMAGE_PYRAMID_TYPE__TILE_SIZE:
				unsetTileSize();
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_WIDTH:
				unsetMaxWidth();
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_HEIGHT:
				unsetMaxHeight();
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__GRID_ORIGIN:
				unsetGridOrigin();
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_GROUP:
				getImagePyramidSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP_GROUP:
				getImagePyramidObjectExtensionGroupGroup().clear();
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
			case KMLPackage.IMAGE_PYRAMID_TYPE__TILE_SIZE:
				return isSetTileSize();
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_WIDTH:
				return isSetMaxWidth();
			case KMLPackage.IMAGE_PYRAMID_TYPE__MAX_HEIGHT:
				return isSetMaxHeight();
			case KMLPackage.IMAGE_PYRAMID_TYPE__GRID_ORIGIN:
				return isSetGridOrigin();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_GROUP:
				return imagePyramidSimpleExtensionGroupGroup != null && !imagePyramidSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP:
				return !getImagePyramidSimpleExtensionGroup().isEmpty();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP_GROUP:
				return imagePyramidObjectExtensionGroupGroup != null && !imagePyramidObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP:
				return !getImagePyramidObjectExtensionGroup().isEmpty();
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
		result.append(" (tileSize: ");
		if (tileSizeESet) result.append(tileSize); else result.append("<unset>");
		result.append(", maxWidth: ");
		if (maxWidthESet) result.append(maxWidth); else result.append("<unset>");
		result.append(", maxHeight: ");
		if (maxHeightESet) result.append(maxHeight); else result.append("<unset>");
		result.append(", gridOrigin: ");
		if (gridOriginESet) result.append(gridOrigin); else result.append("<unset>");
		result.append(", imagePyramidSimpleExtensionGroupGroup: ");
		result.append(imagePyramidSimpleExtensionGroupGroup);
		result.append(", imagePyramidObjectExtensionGroupGroup: ");
		result.append(imagePyramidObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ImagePyramidTypeImpl
