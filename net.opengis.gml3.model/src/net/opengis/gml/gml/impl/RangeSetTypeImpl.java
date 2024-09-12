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

import java.util.Collection;

import net.opengis.gml.gml.DataBlockType;
import net.opengis.gml.gml.FileType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.RangeSetType;
import net.opengis.gml.gml.ValueArrayType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.RangeSetTypeImpl#getValueArray <em>Value Array</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.RangeSetTypeImpl#getAbstractScalarValueListGroup <em>Abstract Scalar Value List Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.RangeSetTypeImpl#getAbstractScalarValueList <em>Abstract Scalar Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.RangeSetTypeImpl#getDataBlock <em>Data Block</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.RangeSetTypeImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeSetTypeImpl extends MinimalEObjectImpl.Container implements RangeSetType {
	/**
	 * The cached value of the '{@link #getValueArray() <em>Value Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueArray()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueArrayType> valueArray;

	/**
	 * The cached value of the '{@link #getAbstractScalarValueListGroup() <em>Abstract Scalar Value List Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractScalarValueListGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractScalarValueListGroup;

	/**
	 * The cached value of the '{@link #getDataBlock() <em>Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBlock()
	 * @generated
	 * @ordered
	 */
	protected DataBlockType dataBlock;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected FileType file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getRangeSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueArrayType> getValueArray() {
		if (valueArray == null) {
			valueArray = new EObjectContainmentEList<ValueArrayType>(ValueArrayType.class, this, GMLPackage.RANGE_SET_TYPE__VALUE_ARRAY);
		}
		return valueArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractScalarValueListGroup() {
		if (abstractScalarValueListGroup == null) {
			abstractScalarValueListGroup = new BasicFeatureMap(this, GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST_GROUP);
		}
		return abstractScalarValueListGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getAbstractScalarValueList() {
		return getAbstractScalarValueListGroup().list(GMLPackage.eINSTANCE.getRangeSetType_AbstractScalarValueList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataBlockType getDataBlock() {
		return dataBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataBlock(DataBlockType newDataBlock, NotificationChain msgs) {
		DataBlockType oldDataBlock = dataBlock;
		dataBlock = newDataBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.RANGE_SET_TYPE__DATA_BLOCK, oldDataBlock, newDataBlock);
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
	public void setDataBlock(DataBlockType newDataBlock) {
		if (newDataBlock != dataBlock) {
			NotificationChain msgs = null;
			if (dataBlock != null)
				msgs = ((InternalEObject)dataBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RANGE_SET_TYPE__DATA_BLOCK, null, msgs);
			if (newDataBlock != null)
				msgs = ((InternalEObject)newDataBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RANGE_SET_TYPE__DATA_BLOCK, null, msgs);
			msgs = basicSetDataBlock(newDataBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.RANGE_SET_TYPE__DATA_BLOCK, newDataBlock, newDataBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileType getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
		FileType oldFile = file;
		file = newFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.RANGE_SET_TYPE__FILE, oldFile, newFile);
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
	public void setFile(FileType newFile) {
		if (newFile != file) {
			NotificationChain msgs = null;
			if (file != null)
				msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RANGE_SET_TYPE__FILE, null, msgs);
			if (newFile != null)
				msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RANGE_SET_TYPE__FILE, null, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.RANGE_SET_TYPE__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				return ((InternalEList<?>)getValueArray()).basicRemove(otherEnd, msgs);
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST_GROUP:
				return ((InternalEList<?>)getAbstractScalarValueListGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST:
				return ((InternalEList<?>)getAbstractScalarValueList()).basicRemove(otherEnd, msgs);
			case GMLPackage.RANGE_SET_TYPE__DATA_BLOCK:
				return basicSetDataBlock(null, msgs);
			case GMLPackage.RANGE_SET_TYPE__FILE:
				return basicSetFile(null, msgs);
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
			case GMLPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				return getValueArray();
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST_GROUP:
				if (coreType) return getAbstractScalarValueListGroup();
				return ((FeatureMap.Internal)getAbstractScalarValueListGroup()).getWrapper();
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST:
				return getAbstractScalarValueList();
			case GMLPackage.RANGE_SET_TYPE__DATA_BLOCK:
				return getDataBlock();
			case GMLPackage.RANGE_SET_TYPE__FILE:
				return getFile();
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
			case GMLPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				getValueArray().clear();
				getValueArray().addAll((Collection<? extends ValueArrayType>)newValue);
				return;
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST_GROUP:
				((FeatureMap.Internal)getAbstractScalarValueListGroup()).set(newValue);
				return;
			case GMLPackage.RANGE_SET_TYPE__DATA_BLOCK:
				setDataBlock((DataBlockType)newValue);
				return;
			case GMLPackage.RANGE_SET_TYPE__FILE:
				setFile((FileType)newValue);
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
			case GMLPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				getValueArray().clear();
				return;
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST_GROUP:
				getAbstractScalarValueListGroup().clear();
				return;
			case GMLPackage.RANGE_SET_TYPE__DATA_BLOCK:
				setDataBlock((DataBlockType)null);
				return;
			case GMLPackage.RANGE_SET_TYPE__FILE:
				setFile((FileType)null);
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
			case GMLPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				return valueArray != null && !valueArray.isEmpty();
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST_GROUP:
				return abstractScalarValueListGroup != null && !abstractScalarValueListGroup.isEmpty();
			case GMLPackage.RANGE_SET_TYPE__ABSTRACT_SCALAR_VALUE_LIST:
				return !getAbstractScalarValueList().isEmpty();
			case GMLPackage.RANGE_SET_TYPE__DATA_BLOCK:
				return dataBlock != null;
			case GMLPackage.RANGE_SET_TYPE__FILE:
				return file != null;
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
		result.append(" (abstractScalarValueListGroup: ");
		result.append(abstractScalarValueListGroup);
		result.append(')');
		return result.toString();
	}

} //RangeSetTypeImpl
