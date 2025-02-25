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

import javax.xml.datatype.XMLGregorianCalendar;

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
import org.openmicroscopy.ome.ExperimentRefType;
import org.openmicroscopy.ome.ExperimenterGroupRefType;
import org.openmicroscopy.ome.ExperimenterRefType;
import org.openmicroscopy.ome.ImageType;
import org.openmicroscopy.ome.ImagingEnvironmentType;
import org.openmicroscopy.ome.InstrumentRefType;
import org.openmicroscopy.ome.MicrobeamManipulationRefType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.ObjectiveSettingsType;
import org.openmicroscopy.ome.PixelsType;
import org.openmicroscopy.ome.ROIRefType;
import org.openmicroscopy.ome.StageLabelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getAcquisitionDate <em>Acquisition Date</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getExperimentRef <em>Experiment Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getExperimenterGroupRef <em>Experimenter Group Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getInstrumentRef <em>Instrument Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getObjectiveSettings <em>Objective Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getImagingEnvironment <em>Imaging Environment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getStageLabel <em>Stage Label</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getPixels <em>Pixels</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getROIRef <em>ROI Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getMicrobeamManipulationRef <em>Microbeam Manipulation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ImageTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageTypeImpl extends MinimalEObjectImpl.Container implements ImageType {
	/**
	 * The default value of the '{@link #getAcquisitionDate() <em>Acquisition Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACQUISITION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcquisitionDate() <em>Acquisition Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar acquisitionDate = ACQUISITION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getExperimentRef() <em>Experiment Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentRef()
	 * @generated
	 * @ordered
	 */
	protected ExperimentRefType experimentRef;

	/**
	 * The cached value of the '{@link #getExperimenterGroupRef() <em>Experimenter Group Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimenterGroupRef()
	 * @generated
	 * @ordered
	 */
	protected ExperimenterGroupRefType experimenterGroupRef;

	/**
	 * The cached value of the '{@link #getInstrumentRef() <em>Instrument Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentRef()
	 * @generated
	 * @ordered
	 */
	protected InstrumentRefType instrumentRef;

	/**
	 * The cached value of the '{@link #getObjectiveSettings() <em>Objective Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSettings()
	 * @generated
	 * @ordered
	 */
	protected ObjectiveSettingsType objectiveSettings;

	/**
	 * The cached value of the '{@link #getImagingEnvironment() <em>Imaging Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ImagingEnvironmentType imagingEnvironment;

	/**
	 * The cached value of the '{@link #getStageLabel() <em>Stage Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageLabel()
	 * @generated
	 * @ordered
	 */
	protected StageLabelType stageLabel;

	/**
	 * The cached value of the '{@link #getPixels() <em>Pixels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixels()
	 * @generated
	 * @ordered
	 */
	protected PixelsType pixels;

	/**
	 * The cached value of the '{@link #getROIRef() <em>ROI Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROIRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ROIRefType> rOIRef;

	/**
	 * The cached value of the '{@link #getMicrobeamManipulationRef() <em>Microbeam Manipulation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrobeamManipulationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<MicrobeamManipulationRefType> microbeamManipulationRef;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getImageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAcquisitionDate() {
		return acquisitionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcquisitionDate(XMLGregorianCalendar newAcquisitionDate) {
		XMLGregorianCalendar oldAcquisitionDate = acquisitionDate;
		acquisitionDate = newAcquisitionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__ACQUISITION_DATE, oldAcquisitionDate, acquisitionDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF, oldExperimenterRef, newExperimenterRef);
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
				msgs = ((InternalEObject)experimenterRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF, null, msgs);
			if (newExperimenterRef != null)
				msgs = ((InternalEObject)newExperimenterRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF, null, msgs);
			msgs = basicSetExperimenterRef(newExperimenterRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF, newExperimenterRef, newExperimenterRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentRefType getExperimentRef() {
		return experimentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimentRef(ExperimentRefType newExperimentRef, NotificationChain msgs) {
		ExperimentRefType oldExperimentRef = experimentRef;
		experimentRef = newExperimentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__EXPERIMENT_REF, oldExperimentRef, newExperimentRef);
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
	public void setExperimentRef(ExperimentRefType newExperimentRef) {
		if (newExperimentRef != experimentRef) {
			NotificationChain msgs = null;
			if (experimentRef != null)
				msgs = ((InternalEObject)experimentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__EXPERIMENT_REF, null, msgs);
			if (newExperimentRef != null)
				msgs = ((InternalEObject)newExperimentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__EXPERIMENT_REF, null, msgs);
			msgs = basicSetExperimentRef(newExperimentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__EXPERIMENT_REF, newExperimentRef, newExperimentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterGroupRefType getExperimenterGroupRef() {
		return experimenterGroupRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimenterGroupRef(ExperimenterGroupRefType newExperimenterGroupRef, NotificationChain msgs) {
		ExperimenterGroupRefType oldExperimenterGroupRef = experimenterGroupRef;
		experimenterGroupRef = newExperimenterGroupRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF, oldExperimenterGroupRef, newExperimenterGroupRef);
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
	public void setExperimenterGroupRef(ExperimenterGroupRefType newExperimenterGroupRef) {
		if (newExperimenterGroupRef != experimenterGroupRef) {
			NotificationChain msgs = null;
			if (experimenterGroupRef != null)
				msgs = ((InternalEObject)experimenterGroupRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF, null, msgs);
			if (newExperimenterGroupRef != null)
				msgs = ((InternalEObject)newExperimenterGroupRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF, null, msgs);
			msgs = basicSetExperimenterGroupRef(newExperimenterGroupRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF, newExperimenterGroupRef, newExperimenterGroupRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstrumentRefType getInstrumentRef() {
		return instrumentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstrumentRef(InstrumentRefType newInstrumentRef, NotificationChain msgs) {
		InstrumentRefType oldInstrumentRef = instrumentRef;
		instrumentRef = newInstrumentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__INSTRUMENT_REF, oldInstrumentRef, newInstrumentRef);
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
	public void setInstrumentRef(InstrumentRefType newInstrumentRef) {
		if (newInstrumentRef != instrumentRef) {
			NotificationChain msgs = null;
			if (instrumentRef != null)
				msgs = ((InternalEObject)instrumentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__INSTRUMENT_REF, null, msgs);
			if (newInstrumentRef != null)
				msgs = ((InternalEObject)newInstrumentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__INSTRUMENT_REF, null, msgs);
			msgs = basicSetInstrumentRef(newInstrumentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__INSTRUMENT_REF, newInstrumentRef, newInstrumentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveSettingsType getObjectiveSettings() {
		return objectiveSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectiveSettings(ObjectiveSettingsType newObjectiveSettings, NotificationChain msgs) {
		ObjectiveSettingsType oldObjectiveSettings = objectiveSettings;
		objectiveSettings = newObjectiveSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS, oldObjectiveSettings, newObjectiveSettings);
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
	public void setObjectiveSettings(ObjectiveSettingsType newObjectiveSettings) {
		if (newObjectiveSettings != objectiveSettings) {
			NotificationChain msgs = null;
			if (objectiveSettings != null)
				msgs = ((InternalEObject)objectiveSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS, null, msgs);
			if (newObjectiveSettings != null)
				msgs = ((InternalEObject)newObjectiveSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS, null, msgs);
			msgs = basicSetObjectiveSettings(newObjectiveSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS, newObjectiveSettings, newObjectiveSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingEnvironmentType getImagingEnvironment() {
		return imagingEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingEnvironment(ImagingEnvironmentType newImagingEnvironment, NotificationChain msgs) {
		ImagingEnvironmentType oldImagingEnvironment = imagingEnvironment;
		imagingEnvironment = newImagingEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT, oldImagingEnvironment, newImagingEnvironment);
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
	public void setImagingEnvironment(ImagingEnvironmentType newImagingEnvironment) {
		if (newImagingEnvironment != imagingEnvironment) {
			NotificationChain msgs = null;
			if (imagingEnvironment != null)
				msgs = ((InternalEObject)imagingEnvironment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT, null, msgs);
			if (newImagingEnvironment != null)
				msgs = ((InternalEObject)newImagingEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT, null, msgs);
			msgs = basicSetImagingEnvironment(newImagingEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT, newImagingEnvironment, newImagingEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StageLabelType getStageLabel() {
		return stageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStageLabel(StageLabelType newStageLabel, NotificationChain msgs) {
		StageLabelType oldStageLabel = stageLabel;
		stageLabel = newStageLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__STAGE_LABEL, oldStageLabel, newStageLabel);
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
	public void setStageLabel(StageLabelType newStageLabel) {
		if (newStageLabel != stageLabel) {
			NotificationChain msgs = null;
			if (stageLabel != null)
				msgs = ((InternalEObject)stageLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__STAGE_LABEL, null, msgs);
			if (newStageLabel != null)
				msgs = ((InternalEObject)newStageLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__STAGE_LABEL, null, msgs);
			msgs = basicSetStageLabel(newStageLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__STAGE_LABEL, newStageLabel, newStageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PixelsType getPixels() {
		return pixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixels(PixelsType newPixels, NotificationChain msgs) {
		PixelsType oldPixels = pixels;
		pixels = newPixels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__PIXELS, oldPixels, newPixels);
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
	public void setPixels(PixelsType newPixels) {
		if (newPixels != pixels) {
			NotificationChain msgs = null;
			if (pixels != null)
				msgs = ((InternalEObject)pixels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__PIXELS, null, msgs);
			if (newPixels != null)
				msgs = ((InternalEObject)newPixels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.IMAGE_TYPE__PIXELS, null, msgs);
			msgs = basicSetPixels(newPixels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__PIXELS, newPixels, newPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ROIRefType> getROIRef() {
		if (rOIRef == null) {
			rOIRef = new EObjectContainmentEList<ROIRefType>(ROIRefType.class, this, OMEPackage.IMAGE_TYPE__ROI_REF);
		}
		return rOIRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MicrobeamManipulationRefType> getMicrobeamManipulationRef() {
		if (microbeamManipulationRef == null) {
			microbeamManipulationRef = new EObjectContainmentEList<MicrobeamManipulationRefType>(MicrobeamManipulationRefType.class, this, OMEPackage.IMAGE_TYPE__MICROBEAM_MANIPULATION_REF);
		}
		return microbeamManipulationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.IMAGE_TYPE__ANNOTATION_REF);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.IMAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF:
				return basicSetExperimenterRef(null, msgs);
			case OMEPackage.IMAGE_TYPE__EXPERIMENT_REF:
				return basicSetExperimentRef(null, msgs);
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF:
				return basicSetExperimenterGroupRef(null, msgs);
			case OMEPackage.IMAGE_TYPE__INSTRUMENT_REF:
				return basicSetInstrumentRef(null, msgs);
			case OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS:
				return basicSetObjectiveSettings(null, msgs);
			case OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT:
				return basicSetImagingEnvironment(null, msgs);
			case OMEPackage.IMAGE_TYPE__STAGE_LABEL:
				return basicSetStageLabel(null, msgs);
			case OMEPackage.IMAGE_TYPE__PIXELS:
				return basicSetPixels(null, msgs);
			case OMEPackage.IMAGE_TYPE__ROI_REF:
				return ((InternalEList<?>)getROIRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.IMAGE_TYPE__MICROBEAM_MANIPULATION_REF:
				return ((InternalEList<?>)getMicrobeamManipulationRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.IMAGE_TYPE__ANNOTATION_REF:
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
			case OMEPackage.IMAGE_TYPE__ACQUISITION_DATE:
				return getAcquisitionDate();
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF:
				return getExperimenterRef();
			case OMEPackage.IMAGE_TYPE__DESCRIPTION:
				return getDescription();
			case OMEPackage.IMAGE_TYPE__EXPERIMENT_REF:
				return getExperimentRef();
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF:
				return getExperimenterGroupRef();
			case OMEPackage.IMAGE_TYPE__INSTRUMENT_REF:
				return getInstrumentRef();
			case OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS:
				return getObjectiveSettings();
			case OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT:
				return getImagingEnvironment();
			case OMEPackage.IMAGE_TYPE__STAGE_LABEL:
				return getStageLabel();
			case OMEPackage.IMAGE_TYPE__PIXELS:
				return getPixels();
			case OMEPackage.IMAGE_TYPE__ROI_REF:
				return getROIRef();
			case OMEPackage.IMAGE_TYPE__MICROBEAM_MANIPULATION_REF:
				return getMicrobeamManipulationRef();
			case OMEPackage.IMAGE_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.IMAGE_TYPE__ID:
				return getID();
			case OMEPackage.IMAGE_TYPE__NAME:
				return getName();
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
			case OMEPackage.IMAGE_TYPE__ACQUISITION_DATE:
				setAcquisitionDate((XMLGregorianCalendar)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF:
				setExperimenterRef((ExperimenterRefType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__EXPERIMENT_REF:
				setExperimentRef((ExperimentRefType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF:
				setExperimenterGroupRef((ExperimenterGroupRefType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__INSTRUMENT_REF:
				setInstrumentRef((InstrumentRefType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS:
				setObjectiveSettings((ObjectiveSettingsType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT:
				setImagingEnvironment((ImagingEnvironmentType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__STAGE_LABEL:
				setStageLabel((StageLabelType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__PIXELS:
				setPixels((PixelsType)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__ROI_REF:
				getROIRef().clear();
				getROIRef().addAll((Collection<? extends ROIRefType>)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__MICROBEAM_MANIPULATION_REF:
				getMicrobeamManipulationRef().clear();
				getMicrobeamManipulationRef().addAll((Collection<? extends MicrobeamManipulationRefType>)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.IMAGE_TYPE__NAME:
				setName((String)newValue);
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
			case OMEPackage.IMAGE_TYPE__ACQUISITION_DATE:
				setAcquisitionDate(ACQUISITION_DATE_EDEFAULT);
				return;
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF:
				setExperimenterRef((ExperimenterRefType)null);
				return;
			case OMEPackage.IMAGE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.IMAGE_TYPE__EXPERIMENT_REF:
				setExperimentRef((ExperimentRefType)null);
				return;
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF:
				setExperimenterGroupRef((ExperimenterGroupRefType)null);
				return;
			case OMEPackage.IMAGE_TYPE__INSTRUMENT_REF:
				setInstrumentRef((InstrumentRefType)null);
				return;
			case OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS:
				setObjectiveSettings((ObjectiveSettingsType)null);
				return;
			case OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT:
				setImagingEnvironment((ImagingEnvironmentType)null);
				return;
			case OMEPackage.IMAGE_TYPE__STAGE_LABEL:
				setStageLabel((StageLabelType)null);
				return;
			case OMEPackage.IMAGE_TYPE__PIXELS:
				setPixels((PixelsType)null);
				return;
			case OMEPackage.IMAGE_TYPE__ROI_REF:
				getROIRef().clear();
				return;
			case OMEPackage.IMAGE_TYPE__MICROBEAM_MANIPULATION_REF:
				getMicrobeamManipulationRef().clear();
				return;
			case OMEPackage.IMAGE_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.IMAGE_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.IMAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case OMEPackage.IMAGE_TYPE__ACQUISITION_DATE:
				return ACQUISITION_DATE_EDEFAULT == null ? acquisitionDate != null : !ACQUISITION_DATE_EDEFAULT.equals(acquisitionDate);
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_REF:
				return experimenterRef != null;
			case OMEPackage.IMAGE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OMEPackage.IMAGE_TYPE__EXPERIMENT_REF:
				return experimentRef != null;
			case OMEPackage.IMAGE_TYPE__EXPERIMENTER_GROUP_REF:
				return experimenterGroupRef != null;
			case OMEPackage.IMAGE_TYPE__INSTRUMENT_REF:
				return instrumentRef != null;
			case OMEPackage.IMAGE_TYPE__OBJECTIVE_SETTINGS:
				return objectiveSettings != null;
			case OMEPackage.IMAGE_TYPE__IMAGING_ENVIRONMENT:
				return imagingEnvironment != null;
			case OMEPackage.IMAGE_TYPE__STAGE_LABEL:
				return stageLabel != null;
			case OMEPackage.IMAGE_TYPE__PIXELS:
				return pixels != null;
			case OMEPackage.IMAGE_TYPE__ROI_REF:
				return rOIRef != null && !rOIRef.isEmpty();
			case OMEPackage.IMAGE_TYPE__MICROBEAM_MANIPULATION_REF:
				return microbeamManipulationRef != null && !microbeamManipulationRef.isEmpty();
			case OMEPackage.IMAGE_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.IMAGE_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.IMAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (acquisitionDate: ");
		result.append(acquisitionDate);
		result.append(", description: ");
		result.append(description);
		result.append(", iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ImageTypeImpl
