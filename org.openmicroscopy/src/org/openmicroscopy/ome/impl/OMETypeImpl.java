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

import org.openmicroscopy.ome.BinaryOnlyType;
import org.openmicroscopy.ome.DatasetType;
import org.openmicroscopy.ome.ExperimentType;
import org.openmicroscopy.ome.ExperimenterGroupType;
import org.openmicroscopy.ome.ExperimenterType;
import org.openmicroscopy.ome.FolderType;
import org.openmicroscopy.ome.ImageType;
import org.openmicroscopy.ome.InstrumentType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.OMEType;
import org.openmicroscopy.ome.PlateType;
import org.openmicroscopy.ome.ProjectType;
import org.openmicroscopy.ome.ROIType;
import org.openmicroscopy.ome.RightsType;
import org.openmicroscopy.ome.ScreenType;
import org.openmicroscopy.ome.StructuredAnnotationsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getPlate <em>Plate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getExperimenter <em>Experimenter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getExperimenterGroup <em>Experimenter Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getStructuredAnnotations <em>Structured Annotations</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getROI <em>ROI</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getBinaryOnly <em>Binary Only</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.OMETypeImpl#getUUID <em>UUID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OMETypeImpl extends MinimalEObjectImpl.Container implements OMEType {
	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected RightsType rights;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectType> project;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetType> dataset;

	/**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected EList<FolderType> folder;

	/**
	 * The cached value of the '{@link #getExperiment() <em>Experiment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiment()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentType> experiment;

	/**
	 * The cached value of the '{@link #getPlate() <em>Plate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlate()
	 * @generated
	 * @ordered
	 */
	protected EList<PlateType> plate;

	/**
	 * The cached value of the '{@link #getScreen() <em>Screen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreen()
	 * @generated
	 * @ordered
	 */
	protected EList<ScreenType> screen;

	/**
	 * The cached value of the '{@link #getExperimenter() <em>Experimenter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimenter()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimenterType> experimenter;

	/**
	 * The cached value of the '{@link #getExperimenterGroup() <em>Experimenter Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimenterGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimenterGroupType> experimenterGroup;

	/**
	 * The cached value of the '{@link #getInstrument() <em>Instrument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected EList<InstrumentType> instrument;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> image;

	/**
	 * The cached value of the '{@link #getStructuredAnnotations() <em>Structured Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredAnnotations()
	 * @generated
	 * @ordered
	 */
	protected StructuredAnnotationsType structuredAnnotations;

	/**
	 * The cached value of the '{@link #getROI() <em>ROI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROI()
	 * @generated
	 * @ordered
	 */
	protected EList<ROIType> rOI;

	/**
	 * The cached value of the '{@link #getBinaryOnly() <em>Binary Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryOnly()
	 * @generated
	 * @ordered
	 */
	protected BinaryOnlyType binaryOnly;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uUID = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getOMEType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightsType getRights() {
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRights(RightsType newRights, NotificationChain msgs) {
		RightsType oldRights = rights;
		rights = newRights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__RIGHTS, oldRights, newRights);
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
	public void setRights(RightsType newRights) {
		if (newRights != rights) {
			NotificationChain msgs = null;
			if (rights != null)
				msgs = ((InternalEObject)rights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.OME_TYPE__RIGHTS, null, msgs);
			if (newRights != null)
				msgs = ((InternalEObject)newRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.OME_TYPE__RIGHTS, null, msgs);
			msgs = basicSetRights(newRights, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__RIGHTS, newRights, newRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProjectType> getProject() {
		if (project == null) {
			project = new EObjectContainmentEList<ProjectType>(ProjectType.class, this, OMEPackage.OME_TYPE__PROJECT);
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetType> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<DatasetType>(DatasetType.class, this, OMEPackage.OME_TYPE__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FolderType> getFolder() {
		if (folder == null) {
			folder = new EObjectContainmentEList<FolderType>(FolderType.class, this, OMEPackage.OME_TYPE__FOLDER);
		}
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExperimentType> getExperiment() {
		if (experiment == null) {
			experiment = new EObjectContainmentEList<ExperimentType>(ExperimentType.class, this, OMEPackage.OME_TYPE__EXPERIMENT);
		}
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlateType> getPlate() {
		if (plate == null) {
			plate = new EObjectContainmentEList<PlateType>(PlateType.class, this, OMEPackage.OME_TYPE__PLATE);
		}
		return plate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScreenType> getScreen() {
		if (screen == null) {
			screen = new EObjectContainmentEList<ScreenType>(ScreenType.class, this, OMEPackage.OME_TYPE__SCREEN);
		}
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExperimenterType> getExperimenter() {
		if (experimenter == null) {
			experimenter = new EObjectContainmentEList<ExperimenterType>(ExperimenterType.class, this, OMEPackage.OME_TYPE__EXPERIMENTER);
		}
		return experimenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExperimenterGroupType> getExperimenterGroup() {
		if (experimenterGroup == null) {
			experimenterGroup = new EObjectContainmentEList<ExperimenterGroupType>(ExperimenterGroupType.class, this, OMEPackage.OME_TYPE__EXPERIMENTER_GROUP);
		}
		return experimenterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstrumentType> getInstrument() {
		if (instrument == null) {
			instrument = new EObjectContainmentEList<InstrumentType>(InstrumentType.class, this, OMEPackage.OME_TYPE__INSTRUMENT);
		}
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImageType> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<ImageType>(ImageType.class, this, OMEPackage.OME_TYPE__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredAnnotationsType getStructuredAnnotations() {
		return structuredAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredAnnotations(StructuredAnnotationsType newStructuredAnnotations, NotificationChain msgs) {
		StructuredAnnotationsType oldStructuredAnnotations = structuredAnnotations;
		structuredAnnotations = newStructuredAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS, oldStructuredAnnotations, newStructuredAnnotations);
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
	public void setStructuredAnnotations(StructuredAnnotationsType newStructuredAnnotations) {
		if (newStructuredAnnotations != structuredAnnotations) {
			NotificationChain msgs = null;
			if (structuredAnnotations != null)
				msgs = ((InternalEObject)structuredAnnotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS, null, msgs);
			if (newStructuredAnnotations != null)
				msgs = ((InternalEObject)newStructuredAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS, null, msgs);
			msgs = basicSetStructuredAnnotations(newStructuredAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS, newStructuredAnnotations, newStructuredAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ROIType> getROI() {
		if (rOI == null) {
			rOI = new EObjectContainmentEList<ROIType>(ROIType.class, this, OMEPackage.OME_TYPE__ROI);
		}
		return rOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOnlyType getBinaryOnly() {
		return binaryOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryOnly(BinaryOnlyType newBinaryOnly, NotificationChain msgs) {
		BinaryOnlyType oldBinaryOnly = binaryOnly;
		binaryOnly = newBinaryOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__BINARY_ONLY, oldBinaryOnly, newBinaryOnly);
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
	public void setBinaryOnly(BinaryOnlyType newBinaryOnly) {
		if (newBinaryOnly != binaryOnly) {
			NotificationChain msgs = null;
			if (binaryOnly != null)
				msgs = ((InternalEObject)binaryOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.OME_TYPE__BINARY_ONLY, null, msgs);
			if (newBinaryOnly != null)
				msgs = ((InternalEObject)newBinaryOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.OME_TYPE__BINARY_ONLY, null, msgs);
			msgs = basicSetBinaryOnly(newBinaryOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__BINARY_ONLY, newBinaryOnly, newBinaryOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUUID() {
		return uUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUUID(String newUUID) {
		String oldUUID = uUID;
		uUID = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OME_TYPE__UUID, oldUUID, uUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.OME_TYPE__RIGHTS:
				return basicSetRights(null, msgs);
			case OMEPackage.OME_TYPE__PROJECT:
				return ((InternalEList<?>)getProject()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__DATASET:
				return ((InternalEList<?>)getDataset()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__FOLDER:
				return ((InternalEList<?>)getFolder()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__EXPERIMENT:
				return ((InternalEList<?>)getExperiment()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__PLATE:
				return ((InternalEList<?>)getPlate()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__SCREEN:
				return ((InternalEList<?>)getScreen()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__EXPERIMENTER:
				return ((InternalEList<?>)getExperimenter()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__EXPERIMENTER_GROUP:
				return ((InternalEList<?>)getExperimenterGroup()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__INSTRUMENT:
				return ((InternalEList<?>)getInstrument()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS:
				return basicSetStructuredAnnotations(null, msgs);
			case OMEPackage.OME_TYPE__ROI:
				return ((InternalEList<?>)getROI()).basicRemove(otherEnd, msgs);
			case OMEPackage.OME_TYPE__BINARY_ONLY:
				return basicSetBinaryOnly(null, msgs);
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
			case OMEPackage.OME_TYPE__RIGHTS:
				return getRights();
			case OMEPackage.OME_TYPE__PROJECT:
				return getProject();
			case OMEPackage.OME_TYPE__DATASET:
				return getDataset();
			case OMEPackage.OME_TYPE__FOLDER:
				return getFolder();
			case OMEPackage.OME_TYPE__EXPERIMENT:
				return getExperiment();
			case OMEPackage.OME_TYPE__PLATE:
				return getPlate();
			case OMEPackage.OME_TYPE__SCREEN:
				return getScreen();
			case OMEPackage.OME_TYPE__EXPERIMENTER:
				return getExperimenter();
			case OMEPackage.OME_TYPE__EXPERIMENTER_GROUP:
				return getExperimenterGroup();
			case OMEPackage.OME_TYPE__INSTRUMENT:
				return getInstrument();
			case OMEPackage.OME_TYPE__IMAGE:
				return getImage();
			case OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS:
				return getStructuredAnnotations();
			case OMEPackage.OME_TYPE__ROI:
				return getROI();
			case OMEPackage.OME_TYPE__BINARY_ONLY:
				return getBinaryOnly();
			case OMEPackage.OME_TYPE__CREATOR:
				return getCreator();
			case OMEPackage.OME_TYPE__UUID:
				return getUUID();
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
			case OMEPackage.OME_TYPE__RIGHTS:
				setRights((RightsType)newValue);
				return;
			case OMEPackage.OME_TYPE__PROJECT:
				getProject().clear();
				getProject().addAll((Collection<? extends ProjectType>)newValue);
				return;
			case OMEPackage.OME_TYPE__DATASET:
				getDataset().clear();
				getDataset().addAll((Collection<? extends DatasetType>)newValue);
				return;
			case OMEPackage.OME_TYPE__FOLDER:
				getFolder().clear();
				getFolder().addAll((Collection<? extends FolderType>)newValue);
				return;
			case OMEPackage.OME_TYPE__EXPERIMENT:
				getExperiment().clear();
				getExperiment().addAll((Collection<? extends ExperimentType>)newValue);
				return;
			case OMEPackage.OME_TYPE__PLATE:
				getPlate().clear();
				getPlate().addAll((Collection<? extends PlateType>)newValue);
				return;
			case OMEPackage.OME_TYPE__SCREEN:
				getScreen().clear();
				getScreen().addAll((Collection<? extends ScreenType>)newValue);
				return;
			case OMEPackage.OME_TYPE__EXPERIMENTER:
				getExperimenter().clear();
				getExperimenter().addAll((Collection<? extends ExperimenterType>)newValue);
				return;
			case OMEPackage.OME_TYPE__EXPERIMENTER_GROUP:
				getExperimenterGroup().clear();
				getExperimenterGroup().addAll((Collection<? extends ExperimenterGroupType>)newValue);
				return;
			case OMEPackage.OME_TYPE__INSTRUMENT:
				getInstrument().clear();
				getInstrument().addAll((Collection<? extends InstrumentType>)newValue);
				return;
			case OMEPackage.OME_TYPE__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS:
				setStructuredAnnotations((StructuredAnnotationsType)newValue);
				return;
			case OMEPackage.OME_TYPE__ROI:
				getROI().clear();
				getROI().addAll((Collection<? extends ROIType>)newValue);
				return;
			case OMEPackage.OME_TYPE__BINARY_ONLY:
				setBinaryOnly((BinaryOnlyType)newValue);
				return;
			case OMEPackage.OME_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case OMEPackage.OME_TYPE__UUID:
				setUUID((String)newValue);
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
			case OMEPackage.OME_TYPE__RIGHTS:
				setRights((RightsType)null);
				return;
			case OMEPackage.OME_TYPE__PROJECT:
				getProject().clear();
				return;
			case OMEPackage.OME_TYPE__DATASET:
				getDataset().clear();
				return;
			case OMEPackage.OME_TYPE__FOLDER:
				getFolder().clear();
				return;
			case OMEPackage.OME_TYPE__EXPERIMENT:
				getExperiment().clear();
				return;
			case OMEPackage.OME_TYPE__PLATE:
				getPlate().clear();
				return;
			case OMEPackage.OME_TYPE__SCREEN:
				getScreen().clear();
				return;
			case OMEPackage.OME_TYPE__EXPERIMENTER:
				getExperimenter().clear();
				return;
			case OMEPackage.OME_TYPE__EXPERIMENTER_GROUP:
				getExperimenterGroup().clear();
				return;
			case OMEPackage.OME_TYPE__INSTRUMENT:
				getInstrument().clear();
				return;
			case OMEPackage.OME_TYPE__IMAGE:
				getImage().clear();
				return;
			case OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS:
				setStructuredAnnotations((StructuredAnnotationsType)null);
				return;
			case OMEPackage.OME_TYPE__ROI:
				getROI().clear();
				return;
			case OMEPackage.OME_TYPE__BINARY_ONLY:
				setBinaryOnly((BinaryOnlyType)null);
				return;
			case OMEPackage.OME_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case OMEPackage.OME_TYPE__UUID:
				setUUID(UUID_EDEFAULT);
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
			case OMEPackage.OME_TYPE__RIGHTS:
				return rights != null;
			case OMEPackage.OME_TYPE__PROJECT:
				return project != null && !project.isEmpty();
			case OMEPackage.OME_TYPE__DATASET:
				return dataset != null && !dataset.isEmpty();
			case OMEPackage.OME_TYPE__FOLDER:
				return folder != null && !folder.isEmpty();
			case OMEPackage.OME_TYPE__EXPERIMENT:
				return experiment != null && !experiment.isEmpty();
			case OMEPackage.OME_TYPE__PLATE:
				return plate != null && !plate.isEmpty();
			case OMEPackage.OME_TYPE__SCREEN:
				return screen != null && !screen.isEmpty();
			case OMEPackage.OME_TYPE__EXPERIMENTER:
				return experimenter != null && !experimenter.isEmpty();
			case OMEPackage.OME_TYPE__EXPERIMENTER_GROUP:
				return experimenterGroup != null && !experimenterGroup.isEmpty();
			case OMEPackage.OME_TYPE__INSTRUMENT:
				return instrument != null && !instrument.isEmpty();
			case OMEPackage.OME_TYPE__IMAGE:
				return image != null && !image.isEmpty();
			case OMEPackage.OME_TYPE__STRUCTURED_ANNOTATIONS:
				return structuredAnnotations != null;
			case OMEPackage.OME_TYPE__ROI:
				return rOI != null && !rOI.isEmpty();
			case OMEPackage.OME_TYPE__BINARY_ONLY:
				return binaryOnly != null;
			case OMEPackage.OME_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case OMEPackage.OME_TYPE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
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
		result.append(" (creator: ");
		result.append(creator);
		result.append(", uUID: ");
		result.append(uUID);
		result.append(')');
		return result.toString();
	}

} //OMETypeImpl
