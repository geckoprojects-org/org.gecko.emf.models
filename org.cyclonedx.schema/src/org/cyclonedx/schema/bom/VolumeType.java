/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 An identifiable, logical unit of data storage tied to a physical device.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#getMode <em>Mode</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#getPath <em>Path</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#getSizeAllocated <em>Size Allocated</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#isRemote <em>Remote</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VolumeType#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType()
 * @model extendedMetaData="name='volumeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VolumeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The unique identifier for the volume instance within its deployment context.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_Uid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The name of the volume instance
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"filesystem"</code>.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.VolumeModeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The mode for the volume instance.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.cyclonedx.schema.bom.VolumeModeEnum
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(VolumeModeEnum)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_Mode()
	 * @model default="filesystem" unsettable="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	VolumeModeEnum getMode();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.cyclonedx.schema.bom.VolumeModeEnum
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(VolumeModeEnum value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(VolumeModeEnum)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(VolumeModeEnum)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The underlying path created from the actual volume.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Size Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The allocated size of the volume accessible to the associated workspace. This should include
	 *                         the scalar size as well as IEC standard unit in either decimal or binary form.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Allocated</em>' attribute.
	 * @see #setSizeAllocated(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_SizeAllocated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sizeAllocated' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSizeAllocated();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getSizeAllocated <em>Size Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Allocated</em>' attribute.
	 * @see #getSizeAllocated()
	 * @generated
	 */
	void setSizeAllocated(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Indicates if the volume persists beyond the life of the resource it is associated with.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #isSetPersistent()
	 * @see #unsetPersistent()
	 * @see #setPersistent(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_Persistent()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='persistent' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isSetPersistent()
	 * @see #unsetPersistent()
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistent()
	 * @see #isPersistent()
	 * @see #setPersistent(boolean)
	 * @generated
	 */
	void unsetPersistent();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.VolumeType#isPersistent <em>Persistent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistent</em>' attribute is set.
	 * @see #unsetPersistent()
	 * @see #isPersistent()
	 * @see #setPersistent(boolean)
	 * @generated
	 */
	boolean isSetPersistent();

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Indicates if the volume is remotely (i.e., network) attached.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #isSetRemote()
	 * @see #unsetRemote()
	 * @see #setRemote(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_Remote()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='remote' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRemote();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #isSetRemote()
	 * @see #unsetRemote()
	 * @see #isRemote()
	 * @generated
	 */
	void setRemote(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemote()
	 * @see #isRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	void unsetRemote();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.VolumeType#isRemote <em>Remote</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote</em>' attribute is set.
	 * @see #unsetRemote()
	 * @see #isRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	boolean isSetRemote();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document properties in a name/value store.
	 *                         This provides flexibility to include data not officially supported in the standard
	 *                         without having to use additional namespaces or create extensions. Property names
	 *                         of interest to the general public are encouraged to be registered in the
	 *                         CycloneDX Property Taxonomy - https://github.com/CycloneDX/cyclonedx-property-taxonomy.
	 *                         Formal registration is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVolumeType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VolumeType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

} // VolumeType
