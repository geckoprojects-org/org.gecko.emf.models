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
package net.opengis.ows.impl;

import java.util.Collection;

import net.opengis.ows.BoundingBoxType;
import net.opengis.ows.CodeType;
import net.opengis.ows.DatasetDescriptionSummaryBaseType;
import net.opengis.ows.MetadataType;
import net.opengis.ows.OWSPackage;
import net.opengis.ows.WGS84BoundingBoxType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Description Summary Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.DatasetDescriptionSummaryBaseTypeImpl#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DatasetDescriptionSummaryBaseTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DatasetDescriptionSummaryBaseTypeImpl#getBoundingBoxGroup <em>Bounding Box Group</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DatasetDescriptionSummaryBaseTypeImpl#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DatasetDescriptionSummaryBaseTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DatasetDescriptionSummaryBaseTypeImpl#getDatasetDescriptionSummary <em>Dataset Description Summary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetDescriptionSummaryBaseTypeImpl extends DescriptionTypeImpl implements DatasetDescriptionSummaryBaseType {
	/**
	 * The cached value of the '{@link #getWGS84BoundingBox() <em>WGS84 Bounding Box</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWGS84BoundingBox()
	 * @generated
	 * @ordered
	 */
	protected EList<WGS84BoundingBoxType> wGS84BoundingBox;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected CodeType identifier;

	/**
	 * The cached value of the '{@link #getBoundingBoxGroup() <em>Bounding Box Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingBoxGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap boundingBoxGroup;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataType> metadata;

	/**
	 * The cached value of the '{@link #getDatasetDescriptionSummary() <em>Dataset Description Summary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetDescriptionSummary()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetDescriptionSummaryBaseType> datasetDescriptionSummary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetDescriptionSummaryBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WGS84BoundingBoxType> getWGS84BoundingBox() {
		if (wGS84BoundingBox == null) {
			wGS84BoundingBox = new EObjectContainmentEList<WGS84BoundingBoxType>(WGS84BoundingBoxType.class, this, OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__WGS84_BOUNDING_BOX);
		}
		return wGS84BoundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(CodeType newIdentifier, NotificationChain msgs) {
		CodeType oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(CodeType newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBoundingBoxGroup() {
		if (boundingBoxGroup == null) {
			boundingBoxGroup = new BasicFeatureMap(this, OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX_GROUP);
		}
		return boundingBoxGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundingBoxType> getBoundingBox() {
		return getBoundingBoxGroup().list(OWSPackage.Literals.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetadataType> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetadataType>(MetadataType.class, this, OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetDescriptionSummaryBaseType> getDatasetDescriptionSummary() {
		if (datasetDescriptionSummary == null) {
			datasetDescriptionSummary = new EObjectContainmentEList<DatasetDescriptionSummaryBaseType>(DatasetDescriptionSummaryBaseType.class, this, OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY);
		}
		return datasetDescriptionSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__WGS84_BOUNDING_BOX:
				return ((InternalEList<?>)getWGS84BoundingBox()).basicRemove(otherEnd, msgs);
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX_GROUP:
				return ((InternalEList<?>)getBoundingBoxGroup()).basicRemove(otherEnd, msgs);
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX:
				return ((InternalEList<?>)getBoundingBox()).basicRemove(otherEnd, msgs);
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				return ((InternalEList<?>)getDatasetDescriptionSummary()).basicRemove(otherEnd, msgs);
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
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__WGS84_BOUNDING_BOX:
				return getWGS84BoundingBox();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER:
				return getIdentifier();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX_GROUP:
				if (coreType) return getBoundingBoxGroup();
				return ((FeatureMap.Internal)getBoundingBoxGroup()).getWrapper();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX:
				return getBoundingBox();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__METADATA:
				return getMetadata();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				return getDatasetDescriptionSummary();
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
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__WGS84_BOUNDING_BOX:
				getWGS84BoundingBox().clear();
				getWGS84BoundingBox().addAll((Collection<? extends WGS84BoundingBoxType>)newValue);
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER:
				setIdentifier((CodeType)newValue);
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX_GROUP:
				((FeatureMap.Internal)getBoundingBoxGroup()).set(newValue);
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX:
				getBoundingBox().clear();
				getBoundingBox().addAll((Collection<? extends BoundingBoxType>)newValue);
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetadataType>)newValue);
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				getDatasetDescriptionSummary().clear();
				getDatasetDescriptionSummary().addAll((Collection<? extends DatasetDescriptionSummaryBaseType>)newValue);
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
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__WGS84_BOUNDING_BOX:
				getWGS84BoundingBox().clear();
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER:
				setIdentifier((CodeType)null);
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX_GROUP:
				getBoundingBoxGroup().clear();
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX:
				getBoundingBox().clear();
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__METADATA:
				getMetadata().clear();
				return;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				getDatasetDescriptionSummary().clear();
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
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__WGS84_BOUNDING_BOX:
				return wGS84BoundingBox != null && !wGS84BoundingBox.isEmpty();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__IDENTIFIER:
				return identifier != null;
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX_GROUP:
				return boundingBoxGroup != null && !boundingBoxGroup.isEmpty();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__BOUNDING_BOX:
				return !getBoundingBox().isEmpty();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__METADATA:
				return metadata != null && !metadata.isEmpty();
			case OWSPackage.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				return datasetDescriptionSummary != null && !datasetDescriptionSummary.isEmpty();
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
		result.append(" (boundingBoxGroup: ");
		result.append(boundingBoxGroup);
		result.append(')');
		return result.toString();
	}

} //DatasetDescriptionSummaryBaseTypeImpl
