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
package org.openmicroscopy.ome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.DichroicRefType;
import org.openmicroscopy.ome.FilterRef;
import org.openmicroscopy.ome.LightPathType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.LightPathTypeImpl#getExcitationFilterRef <em>Excitation Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightPathTypeImpl#getDichroicRef <em>Dichroic Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightPathTypeImpl#getEmissionFilterRef <em>Emission Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightPathTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightPathTypeImpl extends MinimalEObjectImpl.Container implements LightPathType {
	/**
	 * The cached value of the '{@link #getExcitationFilterRef() <em>Excitation Filter Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitationFilterRef()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterRef> excitationFilterRef;

	/**
	 * The cached value of the '{@link #getDichroicRef() <em>Dichroic Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDichroicRef()
	 * @generated
	 * @ordered
	 */
	protected DichroicRefType dichroicRef;

	/**
	 * The cached value of the '{@link #getEmissionFilterRef() <em>Emission Filter Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionFilterRef()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterRef> emissionFilterRef;

	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightPathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getLightPathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterRef> getExcitationFilterRef() {
		if (excitationFilterRef == null) {
			excitationFilterRef = new EObjectContainmentEList<FilterRef>(FilterRef.class, this, OMEPackage.LIGHT_PATH_TYPE__EXCITATION_FILTER_REF);
		}
		return excitationFilterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DichroicRefType getDichroicRef() {
		return dichroicRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDichroicRef(DichroicRefType newDichroicRef, NotificationChain msgs) {
		DichroicRefType oldDichroicRef = dichroicRef;
		dichroicRef = newDichroicRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF, oldDichroicRef, newDichroicRef);
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
	public void setDichroicRef(DichroicRefType newDichroicRef) {
		if (newDichroicRef != dichroicRef) {
			NotificationChain msgs = null;
			if (dichroicRef != null)
				msgs = ((InternalEObject)dichroicRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF, null, msgs);
			if (newDichroicRef != null)
				msgs = ((InternalEObject)newDichroicRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF, null, msgs);
			msgs = basicSetDichroicRef(newDichroicRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF, newDichroicRef, newDichroicRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterRef> getEmissionFilterRef() {
		if (emissionFilterRef == null) {
			emissionFilterRef = new EObjectContainmentEList<FilterRef>(FilterRef.class, this, OMEPackage.LIGHT_PATH_TYPE__EMISSION_FILTER_REF);
		}
		return emissionFilterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.LIGHT_PATH_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.LIGHT_PATH_TYPE__EXCITATION_FILTER_REF:
				return ((InternalEList<?>)getExcitationFilterRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF:
				return basicSetDichroicRef(null, msgs);
			case OMEPackage.LIGHT_PATH_TYPE__EMISSION_FILTER_REF:
				return ((InternalEList<?>)getEmissionFilterRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.LIGHT_PATH_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.LIGHT_PATH_TYPE__EXCITATION_FILTER_REF:
				return getExcitationFilterRef();
			case OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF:
				return getDichroicRef();
			case OMEPackage.LIGHT_PATH_TYPE__EMISSION_FILTER_REF:
				return getEmissionFilterRef();
			case OMEPackage.LIGHT_PATH_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
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
			case OMEPackage.LIGHT_PATH_TYPE__EXCITATION_FILTER_REF:
				getExcitationFilterRef().clear();
				getExcitationFilterRef().addAll((Collection<? extends FilterRef>)newValue);
				return;
			case OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF:
				setDichroicRef((DichroicRefType)newValue);
				return;
			case OMEPackage.LIGHT_PATH_TYPE__EMISSION_FILTER_REF:
				getEmissionFilterRef().clear();
				getEmissionFilterRef().addAll((Collection<? extends FilterRef>)newValue);
				return;
			case OMEPackage.LIGHT_PATH_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
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
			case OMEPackage.LIGHT_PATH_TYPE__EXCITATION_FILTER_REF:
				getExcitationFilterRef().clear();
				return;
			case OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF:
				setDichroicRef((DichroicRefType)null);
				return;
			case OMEPackage.LIGHT_PATH_TYPE__EMISSION_FILTER_REF:
				getEmissionFilterRef().clear();
				return;
			case OMEPackage.LIGHT_PATH_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
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
			case OMEPackage.LIGHT_PATH_TYPE__EXCITATION_FILTER_REF:
				return excitationFilterRef != null && !excitationFilterRef.isEmpty();
			case OMEPackage.LIGHT_PATH_TYPE__DICHROIC_REF:
				return dichroicRef != null;
			case OMEPackage.LIGHT_PATH_TYPE__EMISSION_FILTER_REF:
				return emissionFilterRef != null && !emissionFilterRef.isEmpty();
			case OMEPackage.LIGHT_PATH_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LightPathTypeImpl
