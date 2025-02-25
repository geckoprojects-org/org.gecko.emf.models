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
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.ExperimentType;
import org.openmicroscopy.ome.ExperimenterRefType;
import org.openmicroscopy.ome.MicrobeamManipulationType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.TypeTypeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimentTypeImpl#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimentTypeImpl#getMicrobeamManipulation <em>Microbeam Manipulation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimentTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ExperimentTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentTypeImpl extends MinimalEObjectImpl.Container implements ExperimentType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExperimenterRef() <em>Experimenter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimenterRef()
	 * @generated
	 * @ordered
	 */
	protected ExperimenterRefType experimenterRef;

	/**
	 * The cached value of the '{@link #getMicrobeamManipulation() <em>Microbeam Manipulation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrobeamManipulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MicrobeamManipulationType> microbeamManipulation;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final List<TypeTypeItem> TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected List<TypeTypeItem> type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getExperimentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterRefType getExperimenterRef() {
		return experimenterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimenterRef(ExperimenterRefType newExperimenterRef, NotificationChain msgs) {
		ExperimenterRefType oldExperimenterRef = experimenterRef;
		experimenterRef = newExperimenterRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF, oldExperimenterRef, newExperimenterRef);
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
	public void setExperimenterRef(ExperimenterRefType newExperimenterRef) {
		if (newExperimenterRef != experimenterRef) {
			NotificationChain msgs = null;
			if (experimenterRef != null)
				msgs = ((InternalEObject)experimenterRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF, null, msgs);
			if (newExperimenterRef != null)
				msgs = ((InternalEObject)newExperimenterRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF, null, msgs);
			msgs = basicSetExperimenterRef(newExperimenterRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF, newExperimenterRef, newExperimenterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MicrobeamManipulationType> getMicrobeamManipulation() {
		if (microbeamManipulation == null) {
			microbeamManipulation = new EObjectContainmentEList<MicrobeamManipulationType>(MicrobeamManipulationType.class, this, OMEPackage.EXPERIMENT_TYPE__MICROBEAM_MANIPULATION);
		}
		return microbeamManipulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENT_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<TypeTypeItem> getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(List<TypeTypeItem> newType) {
		List<TypeTypeItem> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.EXPERIMENT_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF:
				return basicSetExperimenterRef(null, msgs);
			case OMEPackage.EXPERIMENT_TYPE__MICROBEAM_MANIPULATION:
				return ((InternalEList<?>)getMicrobeamManipulation()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.EXPERIMENT_TYPE__DESCRIPTION:
				return getDescription();
			case OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF:
				return getExperimenterRef();
			case OMEPackage.EXPERIMENT_TYPE__MICROBEAM_MANIPULATION:
				return getMicrobeamManipulation();
			case OMEPackage.EXPERIMENT_TYPE__ID:
				return getID();
			case OMEPackage.EXPERIMENT_TYPE__TYPE:
				return getType();
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
			case OMEPackage.EXPERIMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF:
				setExperimenterRef((ExperimenterRefType)newValue);
				return;
			case OMEPackage.EXPERIMENT_TYPE__MICROBEAM_MANIPULATION:
				getMicrobeamManipulation().clear();
				getMicrobeamManipulation().addAll((Collection<? extends MicrobeamManipulationType>)newValue);
				return;
			case OMEPackage.EXPERIMENT_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.EXPERIMENT_TYPE__TYPE:
				setType((List<TypeTypeItem>)newValue);
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
			case OMEPackage.EXPERIMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF:
				setExperimenterRef((ExperimenterRefType)null);
				return;
			case OMEPackage.EXPERIMENT_TYPE__MICROBEAM_MANIPULATION:
				getMicrobeamManipulation().clear();
				return;
			case OMEPackage.EXPERIMENT_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.EXPERIMENT_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OMEPackage.EXPERIMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OMEPackage.EXPERIMENT_TYPE__EXPERIMENTER_REF:
				return experimenterRef != null;
			case OMEPackage.EXPERIMENT_TYPE__MICROBEAM_MANIPULATION:
				return microbeamManipulation != null && !microbeamManipulation.isEmpty();
			case OMEPackage.EXPERIMENT_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.EXPERIMENT_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", iD: ");
		result.append(iD);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ExperimentTypeImpl
