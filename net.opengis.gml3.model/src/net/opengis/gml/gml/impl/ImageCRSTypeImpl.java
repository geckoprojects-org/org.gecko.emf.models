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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.AffineCSPropertyType;
import net.opengis.gml.gml.CartesianCSPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.ImageCRSType;
import net.opengis.gml.gml.ImageDatumPropertyType;
import net.opengis.gml.gml.ObliqueCartesianCSPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.ImageCRSTypeImpl#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ImageCRSTypeImpl#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ImageCRSTypeImpl#getAffineCSGroup <em>Affine CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ImageCRSTypeImpl#getAffineCS <em>Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ImageCRSTypeImpl#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ImageCRSTypeImpl#getImageDatumGroup <em>Image Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.ImageCRSTypeImpl#getImageDatum <em>Image Datum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageCRSTypeImpl extends AbstractCRSTypeImpl implements ImageCRSType {
	/**
	 * The cached value of the '{@link #getCartesianCSGroup() <em>Cartesian CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap cartesianCSGroup;

	/**
	 * The cached value of the '{@link #getAffineCSGroup() <em>Affine CS Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffineCSGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap affineCSGroup;

	/**
	 * The cached value of the '{@link #getUsesObliqueCartesianCS() <em>Uses Oblique Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesObliqueCartesianCS()
	 * @generated
	 * @ordered
	 */
	protected ObliqueCartesianCSPropertyType usesObliqueCartesianCS;

	/**
	 * The cached value of the '{@link #getImageDatumGroup() <em>Image Datum Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageDatumGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap imageDatumGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getImageCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCartesianCSGroup() {
		if (cartesianCSGroup == null) {
			cartesianCSGroup = new BasicFeatureMap(this, GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS_GROUP);
		}
		return cartesianCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSPropertyType getCartesianCS() {
		return (CartesianCSPropertyType)getCartesianCSGroup().get(GMLPackage.eINSTANCE.getImageCRSType_CartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS(CartesianCSPropertyType newCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCartesianCSGroup()).basicAdd(GMLPackage.eINSTANCE.getImageCRSType_CartesianCS(), newCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartesianCS(CartesianCSPropertyType newCartesianCS) {
		((FeatureMap.Internal)getCartesianCSGroup()).set(GMLPackage.eINSTANCE.getImageCRSType_CartesianCS(), newCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAffineCSGroup() {
		if (affineCSGroup == null) {
			affineCSGroup = new BasicFeatureMap(this, GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS_GROUP);
		}
		return affineCSGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSPropertyType getAffineCS() {
		return (AffineCSPropertyType)getAffineCSGroup().get(GMLPackage.eINSTANCE.getImageCRSType_AffineCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffineCS(AffineCSPropertyType newAffineCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAffineCSGroup()).basicAdd(GMLPackage.eINSTANCE.getImageCRSType_AffineCS(), newAffineCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffineCS(AffineCSPropertyType newAffineCS) {
		((FeatureMap.Internal)getAffineCSGroup()).set(GMLPackage.eINSTANCE.getImageCRSType_AffineCS(), newAffineCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS() {
		return usesObliqueCartesianCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType newUsesObliqueCartesianCS, NotificationChain msgs) {
		ObliqueCartesianCSPropertyType oldUsesObliqueCartesianCS = usesObliqueCartesianCS;
		usesObliqueCartesianCS = newUsesObliqueCartesianCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, oldUsesObliqueCartesianCS, newUsesObliqueCartesianCS);
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
	public void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType newUsesObliqueCartesianCS) {
		if (newUsesObliqueCartesianCS != usesObliqueCartesianCS) {
			NotificationChain msgs = null;
			if (usesObliqueCartesianCS != null)
				msgs = ((InternalEObject)usesObliqueCartesianCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, null, msgs);
			if (newUsesObliqueCartesianCS != null)
				msgs = ((InternalEObject)newUsesObliqueCartesianCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, null, msgs);
			msgs = basicSetUsesObliqueCartesianCS(newUsesObliqueCartesianCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, newUsesObliqueCartesianCS, newUsesObliqueCartesianCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getImageDatumGroup() {
		if (imageDatumGroup == null) {
			imageDatumGroup = new BasicFeatureMap(this, GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM_GROUP);
		}
		return imageDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumPropertyType getImageDatum() {
		return (ImageDatumPropertyType)getImageDatumGroup().get(GMLPackage.eINSTANCE.getImageCRSType_ImageDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatum(ImageDatumPropertyType newImageDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getImageDatumGroup()).basicAdd(GMLPackage.eINSTANCE.getImageCRSType_ImageDatum(), newImageDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageDatum(ImageDatumPropertyType newImageDatum) {
		((FeatureMap.Internal)getImageDatumGroup()).set(GMLPackage.eINSTANCE.getImageCRSType_ImageDatum(), newImageDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS_GROUP:
				return ((InternalEList<?>)getCartesianCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS:
				return basicSetCartesianCS(null, msgs);
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS_GROUP:
				return ((InternalEList<?>)getAffineCSGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS:
				return basicSetAffineCS(null, msgs);
			case GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				return basicSetUsesObliqueCartesianCS(null, msgs);
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM_GROUP:
				return ((InternalEList<?>)getImageDatumGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM:
				return basicSetImageDatum(null, msgs);
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
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS_GROUP:
				if (coreType) return getCartesianCSGroup();
				return ((FeatureMap.Internal)getCartesianCSGroup()).getWrapper();
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS();
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS_GROUP:
				if (coreType) return getAffineCSGroup();
				return ((FeatureMap.Internal)getAffineCSGroup()).getWrapper();
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS:
				return getAffineCS();
			case GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				return getUsesObliqueCartesianCS();
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM_GROUP:
				if (coreType) return getImageDatumGroup();
				return ((FeatureMap.Internal)getImageDatumGroup()).getWrapper();
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM:
				return getImageDatum();
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
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS_GROUP:
				((FeatureMap.Internal)getCartesianCSGroup()).set(newValue);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)newValue);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS_GROUP:
				((FeatureMap.Internal)getAffineCSGroup()).set(newValue);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS:
				setAffineCS((AffineCSPropertyType)newValue);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSPropertyType)newValue);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM_GROUP:
				((FeatureMap.Internal)getImageDatumGroup()).set(newValue);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM:
				setImageDatum((ImageDatumPropertyType)newValue);
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
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS_GROUP:
				getCartesianCSGroup().clear();
				return;
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS:
				setCartesianCS((CartesianCSPropertyType)null);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS_GROUP:
				getAffineCSGroup().clear();
				return;
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS:
				setAffineCS((AffineCSPropertyType)null);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSPropertyType)null);
				return;
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM_GROUP:
				getImageDatumGroup().clear();
				return;
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM:
				setImageDatum((ImageDatumPropertyType)null);
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
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS_GROUP:
				return cartesianCSGroup != null && !cartesianCSGroup.isEmpty();
			case GMLPackage.IMAGE_CRS_TYPE__CARTESIAN_CS:
				return getCartesianCS() != null;
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS_GROUP:
				return affineCSGroup != null && !affineCSGroup.isEmpty();
			case GMLPackage.IMAGE_CRS_TYPE__AFFINE_CS:
				return getAffineCS() != null;
			case GMLPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				return usesObliqueCartesianCS != null;
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM_GROUP:
				return imageDatumGroup != null && !imageDatumGroup.isEmpty();
			case GMLPackage.IMAGE_CRS_TYPE__IMAGE_DATUM:
				return getImageDatum() != null;
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
		result.append(" (cartesianCSGroup: ");
		result.append(cartesianCSGroup);
		result.append(", affineCSGroup: ");
		result.append(affineCSGroup);
		result.append(", imageDatumGroup: ");
		result.append(imageDatumGroup);
		result.append(')');
		return result.toString();
	}

} //ImageCRSTypeImpl
