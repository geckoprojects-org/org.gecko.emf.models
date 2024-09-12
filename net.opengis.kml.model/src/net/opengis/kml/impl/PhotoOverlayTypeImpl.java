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
import net.opengis.kml.ImagePyramidType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.PhotoOverlayType;
import net.opengis.kml.PointType;
import net.opengis.kml.ShapeEnumType;
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
 * An implementation of the model object '<em><b>Photo Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getViewVolume <em>View Volume</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getImagePyramid <em>Image Pyramid</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getPhotoOverlaySimpleExtensionGroupGroup <em>Photo Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getPhotoOverlaySimpleExtensionGroup <em>Photo Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getPhotoOverlayObjectExtensionGroupGroup <em>Photo Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PhotoOverlayTypeImpl#getPhotoOverlayObjectExtensionGroup <em>Photo Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhotoOverlayTypeImpl extends AbstractOverlayTypeImpl implements PhotoOverlayType {
	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected double rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The cached value of the '{@link #getViewVolume() <em>View Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewVolume()
	 * @generated
	 * @ordered
	 */
	protected ViewVolumeType viewVolume;

	/**
	 * The cached value of the '{@link #getImagePyramid() <em>Image Pyramid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePyramid()
	 * @generated
	 * @ordered
	 */
	protected ImagePyramidType imagePyramid;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected PointType point;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final ShapeEnumType SHAPE_EDEFAULT = ShapeEnumType.RECTANGLE;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected ShapeEnumType shape = SHAPE_EDEFAULT;

	/**
	 * This is true if the Shape attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shapeESet;

	/**
	 * The cached value of the '{@link #getPhotoOverlaySimpleExtensionGroupGroup() <em>Photo Overlay Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotoOverlaySimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap photoOverlaySimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getPhotoOverlayObjectExtensionGroupGroup() <em>Photo Overlay Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotoOverlayObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap photoOverlayObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoOverlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getPhotoOverlayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(double newRotation) {
		double oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRotation() {
		double oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.PHOTO_OVERLAY_TYPE__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewVolumeType getViewVolume() {
		return viewVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewVolume(ViewVolumeType newViewVolume, NotificationChain msgs) {
		ViewVolumeType oldViewVolume = viewVolume;
		viewVolume = newViewVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME, oldViewVolume, newViewVolume);
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
	public void setViewVolume(ViewVolumeType newViewVolume) {
		if (newViewVolume != viewVolume) {
			NotificationChain msgs = null;
			if (viewVolume != null)
				msgs = ((InternalEObject)viewVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME, null, msgs);
			if (newViewVolume != null)
				msgs = ((InternalEObject)newViewVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME, null, msgs);
			msgs = basicSetViewVolume(newViewVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME, newViewVolume, newViewVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagePyramidType getImagePyramid() {
		return imagePyramid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePyramid(ImagePyramidType newImagePyramid, NotificationChain msgs) {
		ImagePyramidType oldImagePyramid = imagePyramid;
		imagePyramid = newImagePyramid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID, oldImagePyramid, newImagePyramid);
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
	public void setImagePyramid(ImagePyramidType newImagePyramid) {
		if (newImagePyramid != imagePyramid) {
			NotificationChain msgs = null;
			if (imagePyramid != null)
				msgs = ((InternalEObject)imagePyramid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID, null, msgs);
			if (newImagePyramid != null)
				msgs = ((InternalEObject)newImagePyramid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID, null, msgs);
			msgs = basicSetImagePyramid(newImagePyramid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID, newImagePyramid, newImagePyramid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(PointType newPoint, NotificationChain msgs) {
		PointType oldPoint = point;
		point = newPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__POINT, oldPoint, newPoint);
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
	public void setPoint(PointType newPoint) {
		if (newPoint != point) {
			NotificationChain msgs = null;
			if (point != null)
				msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KMLPackage.PHOTO_OVERLAY_TYPE__POINT, null, msgs);
			if (newPoint != null)
				msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KMLPackage.PHOTO_OVERLAY_TYPE__POINT, null, msgs);
			msgs = basicSetPoint(newPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__POINT, newPoint, newPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShapeEnumType getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShape(ShapeEnumType newShape) {
		ShapeEnumType oldShape = shape;
		shape = newShape == null ? SHAPE_EDEFAULT : newShape;
		boolean oldShapeESet = shapeESet;
		shapeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.PHOTO_OVERLAY_TYPE__SHAPE, oldShape, shape, !oldShapeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShape() {
		ShapeEnumType oldShape = shape;
		boolean oldShapeESet = shapeESet;
		shape = SHAPE_EDEFAULT;
		shapeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.PHOTO_OVERLAY_TYPE__SHAPE, oldShape, SHAPE_EDEFAULT, oldShapeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShape() {
		return shapeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPhotoOverlaySimpleExtensionGroupGroup() {
		if (photoOverlaySimpleExtensionGroupGroup == null) {
			photoOverlaySimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return photoOverlaySimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getPhotoOverlaySimpleExtensionGroup() {
		return getPhotoOverlaySimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPhotoOverlayType_PhotoOverlaySimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPhotoOverlayObjectExtensionGroupGroup() {
		if (photoOverlayObjectExtensionGroupGroup == null) {
			photoOverlayObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return photoOverlayObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getPhotoOverlayObjectExtensionGroup() {
		return getPhotoOverlayObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPhotoOverlayType_PhotoOverlayObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME:
				return basicSetViewVolume(null, msgs);
			case KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID:
				return basicSetImagePyramid(null, msgs);
			case KMLPackage.PHOTO_OVERLAY_TYPE__POINT:
				return basicSetPoint(null, msgs);
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPhotoOverlaySimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPhotoOverlayObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getPhotoOverlayObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.PHOTO_OVERLAY_TYPE__ROTATION:
				return getRotation();
			case KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME:
				return getViewVolume();
			case KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID:
				return getImagePyramid();
			case KMLPackage.PHOTO_OVERLAY_TYPE__POINT:
				return getPoint();
			case KMLPackage.PHOTO_OVERLAY_TYPE__SHAPE:
				return getShape();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getPhotoOverlaySimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getPhotoOverlaySimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getPhotoOverlaySimpleExtensionGroup();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getPhotoOverlayObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getPhotoOverlayObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getPhotoOverlayObjectExtensionGroup();
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
			case KMLPackage.PHOTO_OVERLAY_TYPE__ROTATION:
				setRotation((Double)newValue);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME:
				setViewVolume((ViewVolumeType)newValue);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID:
				setImagePyramid((ImagePyramidType)newValue);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__POINT:
				setPoint((PointType)newValue);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__SHAPE:
				setShape((ShapeEnumType)newValue);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPhotoOverlaySimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPhotoOverlayObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.PHOTO_OVERLAY_TYPE__ROTATION:
				unsetRotation();
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME:
				setViewVolume((ViewVolumeType)null);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID:
				setImagePyramid((ImagePyramidType)null);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__POINT:
				setPoint((PointType)null);
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__SHAPE:
				unsetShape();
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				getPhotoOverlaySimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				getPhotoOverlayObjectExtensionGroupGroup().clear();
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
			case KMLPackage.PHOTO_OVERLAY_TYPE__ROTATION:
				return isSetRotation();
			case KMLPackage.PHOTO_OVERLAY_TYPE__VIEW_VOLUME:
				return viewVolume != null;
			case KMLPackage.PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID:
				return imagePyramid != null;
			case KMLPackage.PHOTO_OVERLAY_TYPE__POINT:
				return point != null;
			case KMLPackage.PHOTO_OVERLAY_TYPE__SHAPE:
				return isSetShape();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP:
				return photoOverlaySimpleExtensionGroupGroup != null && !photoOverlaySimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return !getPhotoOverlaySimpleExtensionGroup().isEmpty();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP:
				return photoOverlayObjectExtensionGroupGroup != null && !photoOverlayObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP:
				return !getPhotoOverlayObjectExtensionGroup().isEmpty();
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
		result.append(" (rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", shape: ");
		if (shapeESet) result.append(shape); else result.append("<unset>");
		result.append(", photoOverlaySimpleExtensionGroupGroup: ");
		result.append(photoOverlaySimpleExtensionGroupGroup);
		result.append(", photoOverlayObjectExtensionGroupGroup: ");
		result.append(photoOverlayObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //PhotoOverlayTypeImpl
