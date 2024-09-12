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

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RecordPropertyType;

import org.isotc211._2005.gmd.CICitationPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDGeoreferenceableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Georeferenceable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeoreferenceableTypeImpl#getControlPointAvailability <em>Control Point Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeoreferenceableTypeImpl#getOrientationParameterAvailability <em>Orientation Parameter Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeoreferenceableTypeImpl#getOrientationParameterDescription <em>Orientation Parameter Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeoreferenceableTypeImpl#getGeoreferencedParameters <em>Georeferenced Parameters</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeoreferenceableTypeImpl#getParameterCitation <em>Parameter Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDGeoreferenceableTypeImpl extends MDGridSpatialRepresentationTypeImpl implements MDGeoreferenceableType {
	/**
	 * The cached value of the '{@link #getControlPointAvailability() <em>Control Point Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPointAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType controlPointAvailability;

	/**
	 * The cached value of the '{@link #getOrientationParameterAvailability() <em>Orientation Parameter Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationParameterAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType orientationParameterAvailability;

	/**
	 * The cached value of the '{@link #getOrientationParameterDescription() <em>Orientation Parameter Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationParameterDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType orientationParameterDescription;

	/**
	 * The cached value of the '{@link #getGeoreferencedParameters() <em>Georeferenced Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoreferencedParameters()
	 * @generated
	 * @ordered
	 */
	protected RecordPropertyType georeferencedParameters;

	/**
	 * The cached value of the '{@link #getParameterCitation() <em>Parameter Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<CICitationPropertyType> parameterCitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDGeoreferenceableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDGeoreferenceableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getControlPointAvailability() {
		return controlPointAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlPointAvailability(BooleanPropertyType newControlPointAvailability, NotificationChain msgs) {
		BooleanPropertyType oldControlPointAvailability = controlPointAvailability;
		controlPointAvailability = newControlPointAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY, oldControlPointAvailability, newControlPointAvailability);
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
	public void setControlPointAvailability(BooleanPropertyType newControlPointAvailability) {
		if (newControlPointAvailability != controlPointAvailability) {
			NotificationChain msgs = null;
			if (controlPointAvailability != null)
				msgs = ((InternalEObject)controlPointAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY, null, msgs);
			if (newControlPointAvailability != null)
				msgs = ((InternalEObject)newControlPointAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY, null, msgs);
			msgs = basicSetControlPointAvailability(newControlPointAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY, newControlPointAvailability, newControlPointAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getOrientationParameterAvailability() {
		return orientationParameterAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationParameterAvailability(BooleanPropertyType newOrientationParameterAvailability, NotificationChain msgs) {
		BooleanPropertyType oldOrientationParameterAvailability = orientationParameterAvailability;
		orientationParameterAvailability = newOrientationParameterAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY, oldOrientationParameterAvailability, newOrientationParameterAvailability);
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
	public void setOrientationParameterAvailability(BooleanPropertyType newOrientationParameterAvailability) {
		if (newOrientationParameterAvailability != orientationParameterAvailability) {
			NotificationChain msgs = null;
			if (orientationParameterAvailability != null)
				msgs = ((InternalEObject)orientationParameterAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY, null, msgs);
			if (newOrientationParameterAvailability != null)
				msgs = ((InternalEObject)newOrientationParameterAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY, null, msgs);
			msgs = basicSetOrientationParameterAvailability(newOrientationParameterAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY, newOrientationParameterAvailability, newOrientationParameterAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getOrientationParameterDescription() {
		return orientationParameterDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationParameterDescription(CharacterStringPropertyType newOrientationParameterDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldOrientationParameterDescription = orientationParameterDescription;
		orientationParameterDescription = newOrientationParameterDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION, oldOrientationParameterDescription, newOrientationParameterDescription);
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
	public void setOrientationParameterDescription(CharacterStringPropertyType newOrientationParameterDescription) {
		if (newOrientationParameterDescription != orientationParameterDescription) {
			NotificationChain msgs = null;
			if (orientationParameterDescription != null)
				msgs = ((InternalEObject)orientationParameterDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION, null, msgs);
			if (newOrientationParameterDescription != null)
				msgs = ((InternalEObject)newOrientationParameterDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION, null, msgs);
			msgs = basicSetOrientationParameterDescription(newOrientationParameterDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION, newOrientationParameterDescription, newOrientationParameterDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordPropertyType getGeoreferencedParameters() {
		return georeferencedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeoreferencedParameters(RecordPropertyType newGeoreferencedParameters, NotificationChain msgs) {
		RecordPropertyType oldGeoreferencedParameters = georeferencedParameters;
		georeferencedParameters = newGeoreferencedParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS, oldGeoreferencedParameters, newGeoreferencedParameters);
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
	public void setGeoreferencedParameters(RecordPropertyType newGeoreferencedParameters) {
		if (newGeoreferencedParameters != georeferencedParameters) {
			NotificationChain msgs = null;
			if (georeferencedParameters != null)
				msgs = ((InternalEObject)georeferencedParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS, null, msgs);
			if (newGeoreferencedParameters != null)
				msgs = ((InternalEObject)newGeoreferencedParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS, null, msgs);
			msgs = basicSetGeoreferencedParameters(newGeoreferencedParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS, newGeoreferencedParameters, newGeoreferencedParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CICitationPropertyType> getParameterCitation() {
		if (parameterCitation == null) {
			parameterCitation = new EObjectContainmentEList<CICitationPropertyType>(CICitationPropertyType.class, this, GMDPackage.MD_GEOREFERENCEABLE_TYPE__PARAMETER_CITATION);
		}
		return parameterCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY:
				return basicSetControlPointAvailability(null, msgs);
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY:
				return basicSetOrientationParameterAvailability(null, msgs);
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION:
				return basicSetOrientationParameterDescription(null, msgs);
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS:
				return basicSetGeoreferencedParameters(null, msgs);
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__PARAMETER_CITATION:
				return ((InternalEList<?>)getParameterCitation()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY:
				return getControlPointAvailability();
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY:
				return getOrientationParameterAvailability();
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION:
				return getOrientationParameterDescription();
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS:
				return getGeoreferencedParameters();
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__PARAMETER_CITATION:
				return getParameterCitation();
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
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY:
				setControlPointAvailability((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY:
				setOrientationParameterAvailability((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION:
				setOrientationParameterDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS:
				setGeoreferencedParameters((RecordPropertyType)newValue);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__PARAMETER_CITATION:
				getParameterCitation().clear();
				getParameterCitation().addAll((Collection<? extends CICitationPropertyType>)newValue);
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
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY:
				setControlPointAvailability((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY:
				setOrientationParameterAvailability((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION:
				setOrientationParameterDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS:
				setGeoreferencedParameters((RecordPropertyType)null);
				return;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__PARAMETER_CITATION:
				getParameterCitation().clear();
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
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__CONTROL_POINT_AVAILABILITY:
				return controlPointAvailability != null;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_AVAILABILITY:
				return orientationParameterAvailability != null;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__ORIENTATION_PARAMETER_DESCRIPTION:
				return orientationParameterDescription != null;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__GEOREFERENCED_PARAMETERS:
				return georeferencedParameters != null;
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE__PARAMETER_CITATION:
				return parameterCitation != null && !parameterCitation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDGeoreferenceableTypeImpl
