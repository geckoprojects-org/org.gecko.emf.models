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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.EXExtentType;
import org.isotc211._2005.gmd.EXGeographicExtentPropertyType;
import org.isotc211._2005.gmd.EXTemporalExtentPropertyType;
import org.isotc211._2005.gmd.EXVerticalExtentPropertyType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EX Extent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXExtentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXExtentTypeImpl#getGeographicElement <em>Geographic Element</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXExtentTypeImpl#getTemporalElement <em>Temporal Element</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXExtentTypeImpl#getVerticalElement <em>Vertical Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXExtentTypeImpl extends AbstractObjectTypeImpl implements EXExtentType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType description;

	/**
	 * The cached value of the '{@link #getGeographicElement() <em>Geographic Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EXGeographicExtentPropertyType> geographicElement;

	/**
	 * The cached value of the '{@link #getTemporalElement() <em>Temporal Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EXTemporalExtentPropertyType> temporalElement;

	/**
	 * The cached value of the '{@link #getVerticalElement() <em>Vertical Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EXVerticalExtentPropertyType> verticalElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXExtentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getEXExtentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CharacterStringPropertyType newDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_EXTENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(CharacterStringPropertyType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_EXTENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_EXTENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_EXTENT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EXGeographicExtentPropertyType> getGeographicElement() {
		if (geographicElement == null) {
			geographicElement = new EObjectContainmentEList<EXGeographicExtentPropertyType>(EXGeographicExtentPropertyType.class, this, GMDPackage.EX_EXTENT_TYPE__GEOGRAPHIC_ELEMENT);
		}
		return geographicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EXTemporalExtentPropertyType> getTemporalElement() {
		if (temporalElement == null) {
			temporalElement = new EObjectContainmentEList<EXTemporalExtentPropertyType>(EXTemporalExtentPropertyType.class, this, GMDPackage.EX_EXTENT_TYPE__TEMPORAL_ELEMENT);
		}
		return temporalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EXVerticalExtentPropertyType> getVerticalElement() {
		if (verticalElement == null) {
			verticalElement = new EObjectContainmentEList<EXVerticalExtentPropertyType>(EXVerticalExtentPropertyType.class, this, GMDPackage.EX_EXTENT_TYPE__VERTICAL_ELEMENT);
		}
		return verticalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.EX_EXTENT_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMDPackage.EX_EXTENT_TYPE__GEOGRAPHIC_ELEMENT:
				return ((InternalEList<?>)getGeographicElement()).basicRemove(otherEnd, msgs);
			case GMDPackage.EX_EXTENT_TYPE__TEMPORAL_ELEMENT:
				return ((InternalEList<?>)getTemporalElement()).basicRemove(otherEnd, msgs);
			case GMDPackage.EX_EXTENT_TYPE__VERTICAL_ELEMENT:
				return ((InternalEList<?>)getVerticalElement()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.EX_EXTENT_TYPE__DESCRIPTION:
				return getDescription();
			case GMDPackage.EX_EXTENT_TYPE__GEOGRAPHIC_ELEMENT:
				return getGeographicElement();
			case GMDPackage.EX_EXTENT_TYPE__TEMPORAL_ELEMENT:
				return getTemporalElement();
			case GMDPackage.EX_EXTENT_TYPE__VERTICAL_ELEMENT:
				return getVerticalElement();
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
			case GMDPackage.EX_EXTENT_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.EX_EXTENT_TYPE__GEOGRAPHIC_ELEMENT:
				getGeographicElement().clear();
				getGeographicElement().addAll((Collection<? extends EXGeographicExtentPropertyType>)newValue);
				return;
			case GMDPackage.EX_EXTENT_TYPE__TEMPORAL_ELEMENT:
				getTemporalElement().clear();
				getTemporalElement().addAll((Collection<? extends EXTemporalExtentPropertyType>)newValue);
				return;
			case GMDPackage.EX_EXTENT_TYPE__VERTICAL_ELEMENT:
				getVerticalElement().clear();
				getVerticalElement().addAll((Collection<? extends EXVerticalExtentPropertyType>)newValue);
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
			case GMDPackage.EX_EXTENT_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.EX_EXTENT_TYPE__GEOGRAPHIC_ELEMENT:
				getGeographicElement().clear();
				return;
			case GMDPackage.EX_EXTENT_TYPE__TEMPORAL_ELEMENT:
				getTemporalElement().clear();
				return;
			case GMDPackage.EX_EXTENT_TYPE__VERTICAL_ELEMENT:
				getVerticalElement().clear();
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
			case GMDPackage.EX_EXTENT_TYPE__DESCRIPTION:
				return description != null;
			case GMDPackage.EX_EXTENT_TYPE__GEOGRAPHIC_ELEMENT:
				return geographicElement != null && !geographicElement.isEmpty();
			case GMDPackage.EX_EXTENT_TYPE__TEMPORAL_ELEMENT:
				return temporalElement != null && !temporalElement.isEmpty();
			case GMDPackage.EX_EXTENT_TYPE__VERTICAL_ELEMENT:
				return verticalElement != null && !verticalElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EXExtentTypeImpl
