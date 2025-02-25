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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.DetectorType;
import org.openmicroscopy.ome.DichroicType;
import org.openmicroscopy.ome.FilterSetType;
import org.openmicroscopy.ome.FilterType;
import org.openmicroscopy.ome.InstrumentType;
import org.openmicroscopy.ome.LightSource;
import org.openmicroscopy.ome.MicroscopeType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.ObjectiveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instrument Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getMicroscope <em>Microscope</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getLightSourceGroupGroup <em>Light Source Group Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getLightSourceGroup <em>Light Source Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getDetector <em>Detector</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getFilterSet <em>Filter Set</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getDichroic <em>Dichroic</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.InstrumentTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstrumentTypeImpl extends MinimalEObjectImpl.Container implements InstrumentType {
	/**
	 * The cached value of the '{@link #getMicroscope() <em>Microscope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroscope()
	 * @generated
	 * @ordered
	 */
	protected MicroscopeType microscope;

	/**
	 * The cached value of the '{@link #getLightSourceGroupGroup() <em>Light Source Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSourceGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lightSourceGroupGroup;

	/**
	 * The cached value of the '{@link #getDetector() <em>Detector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetector()
	 * @generated
	 * @ordered
	 */
	protected EList<DetectorType> detector;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectiveType> objective;

	/**
	 * The cached value of the '{@link #getFilterSet() <em>Filter Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterSetType> filterSet;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterType> filter;

	/**
	 * The cached value of the '{@link #getDichroic() <em>Dichroic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDichroic()
	 * @generated
	 * @ordered
	 */
	protected EList<DichroicType> dichroic;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstrumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getInstrumentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroscopeType getMicroscope() {
		return microscope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicroscope(MicroscopeType newMicroscope, NotificationChain msgs) {
		MicroscopeType oldMicroscope = microscope;
		microscope = newMicroscope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.INSTRUMENT_TYPE__MICROSCOPE, oldMicroscope, newMicroscope);
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
	public void setMicroscope(MicroscopeType newMicroscope) {
		if (newMicroscope != microscope) {
			NotificationChain msgs = null;
			if (microscope != null)
				msgs = ((InternalEObject)microscope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.INSTRUMENT_TYPE__MICROSCOPE, null, msgs);
			if (newMicroscope != null)
				msgs = ((InternalEObject)newMicroscope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.INSTRUMENT_TYPE__MICROSCOPE, null, msgs);
			msgs = basicSetMicroscope(newMicroscope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.INSTRUMENT_TYPE__MICROSCOPE, newMicroscope, newMicroscope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLightSourceGroupGroup() {
		if (lightSourceGroupGroup == null) {
			lightSourceGroupGroup = new BasicFeatureMap(this, OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP_GROUP);
		}
		return lightSourceGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LightSource> getLightSourceGroup() {
		return getLightSourceGroupGroup().list(OMEPackage.eINSTANCE.getInstrumentType_LightSourceGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetectorType> getDetector() {
		if (detector == null) {
			detector = new EObjectContainmentEList<DetectorType>(DetectorType.class, this, OMEPackage.INSTRUMENT_TYPE__DETECTOR);
		}
		return detector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectiveType> getObjective() {
		if (objective == null) {
			objective = new EObjectContainmentEList<ObjectiveType>(ObjectiveType.class, this, OMEPackage.INSTRUMENT_TYPE__OBJECTIVE);
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterSetType> getFilterSet() {
		if (filterSet == null) {
			filterSet = new EObjectContainmentEList<FilterSetType>(FilterSetType.class, this, OMEPackage.INSTRUMENT_TYPE__FILTER_SET);
		}
		return filterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterType> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<FilterType>(FilterType.class, this, OMEPackage.INSTRUMENT_TYPE__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DichroicType> getDichroic() {
		if (dichroic == null) {
			dichroic = new EObjectContainmentEList<DichroicType>(DichroicType.class, this, OMEPackage.INSTRUMENT_TYPE__DICHROIC);
		}
		return dichroic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.INSTRUMENT_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.INSTRUMENT_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.INSTRUMENT_TYPE__MICROSCOPE:
				return basicSetMicroscope(null, msgs);
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP_GROUP:
				return ((InternalEList<?>)getLightSourceGroupGroup()).basicRemove(otherEnd, msgs);
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP:
				return ((InternalEList<?>)getLightSourceGroup()).basicRemove(otherEnd, msgs);
			case OMEPackage.INSTRUMENT_TYPE__DETECTOR:
				return ((InternalEList<?>)getDetector()).basicRemove(otherEnd, msgs);
			case OMEPackage.INSTRUMENT_TYPE__OBJECTIVE:
				return ((InternalEList<?>)getObjective()).basicRemove(otherEnd, msgs);
			case OMEPackage.INSTRUMENT_TYPE__FILTER_SET:
				return ((InternalEList<?>)getFilterSet()).basicRemove(otherEnd, msgs);
			case OMEPackage.INSTRUMENT_TYPE__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case OMEPackage.INSTRUMENT_TYPE__DICHROIC:
				return ((InternalEList<?>)getDichroic()).basicRemove(otherEnd, msgs);
			case OMEPackage.INSTRUMENT_TYPE__ANNOTATION_REF:
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
			case OMEPackage.INSTRUMENT_TYPE__MICROSCOPE:
				return getMicroscope();
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP_GROUP:
				if (coreType) return getLightSourceGroupGroup();
				return ((FeatureMap.Internal)getLightSourceGroupGroup()).getWrapper();
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP:
				return getLightSourceGroup();
			case OMEPackage.INSTRUMENT_TYPE__DETECTOR:
				return getDetector();
			case OMEPackage.INSTRUMENT_TYPE__OBJECTIVE:
				return getObjective();
			case OMEPackage.INSTRUMENT_TYPE__FILTER_SET:
				return getFilterSet();
			case OMEPackage.INSTRUMENT_TYPE__FILTER:
				return getFilter();
			case OMEPackage.INSTRUMENT_TYPE__DICHROIC:
				return getDichroic();
			case OMEPackage.INSTRUMENT_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.INSTRUMENT_TYPE__ID:
				return getID();
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
			case OMEPackage.INSTRUMENT_TYPE__MICROSCOPE:
				setMicroscope((MicroscopeType)newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP_GROUP:
				((FeatureMap.Internal)getLightSourceGroupGroup()).set(newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__DETECTOR:
				getDetector().clear();
				getDetector().addAll((Collection<? extends DetectorType>)newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__OBJECTIVE:
				getObjective().clear();
				getObjective().addAll((Collection<? extends ObjectiveType>)newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__FILTER_SET:
				getFilterSet().clear();
				getFilterSet().addAll((Collection<? extends FilterSetType>)newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends FilterType>)newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__DICHROIC:
				getDichroic().clear();
				getDichroic().addAll((Collection<? extends DichroicType>)newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.INSTRUMENT_TYPE__ID:
				setID((String)newValue);
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
			case OMEPackage.INSTRUMENT_TYPE__MICROSCOPE:
				setMicroscope((MicroscopeType)null);
				return;
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP_GROUP:
				getLightSourceGroupGroup().clear();
				return;
			case OMEPackage.INSTRUMENT_TYPE__DETECTOR:
				getDetector().clear();
				return;
			case OMEPackage.INSTRUMENT_TYPE__OBJECTIVE:
				getObjective().clear();
				return;
			case OMEPackage.INSTRUMENT_TYPE__FILTER_SET:
				getFilterSet().clear();
				return;
			case OMEPackage.INSTRUMENT_TYPE__FILTER:
				getFilter().clear();
				return;
			case OMEPackage.INSTRUMENT_TYPE__DICHROIC:
				getDichroic().clear();
				return;
			case OMEPackage.INSTRUMENT_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.INSTRUMENT_TYPE__ID:
				setID(ID_EDEFAULT);
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
			case OMEPackage.INSTRUMENT_TYPE__MICROSCOPE:
				return microscope != null;
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP_GROUP:
				return lightSourceGroupGroup != null && !lightSourceGroupGroup.isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__LIGHT_SOURCE_GROUP:
				return !getLightSourceGroup().isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__DETECTOR:
				return detector != null && !detector.isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__OBJECTIVE:
				return objective != null && !objective.isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__FILTER_SET:
				return filterSet != null && !filterSet.isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__FILTER:
				return filter != null && !filter.isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__DICHROIC:
				return dichroic != null && !dichroic.isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.INSTRUMENT_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
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
		result.append(" (lightSourceGroupGroup: ");
		result.append(lightSourceGroupGroup);
		result.append(", iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //InstrumentTypeImpl
