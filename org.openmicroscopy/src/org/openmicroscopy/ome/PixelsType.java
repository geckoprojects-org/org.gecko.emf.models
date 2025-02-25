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
package org.openmicroscopy.ome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pixels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getTiffData <em>Tiff Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getMetadataOnly <em>Metadata Only</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#isBigEndian <em>Big Endian</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getDimensionOrder <em>Dimension Order</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#isInterleaved <em>Interleaved</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeX <em>Physical Size X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeXUnit <em>Physical Size XUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeY <em>Physical Size Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeYUnit <em>Physical Size YUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZ <em>Physical Size Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZUnit <em>Physical Size ZUnit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getSignificantBits <em>Significant Bits</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getSizeC <em>Size C</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getSizeT <em>Size T</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getSizeZ <em>Size Z</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getTimeIncrement <em>Time Increment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getTimeIncrementUnit <em>Time Increment Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.PixelsType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType()
 * @model extendedMetaData="name='Pixels_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PixelsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ChannelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         There must be one per channel in the Image, even for a single-plane image.
	 *         And information about how each of them was acquired is stored in the various optional *Ref elements.  Each Logical Channel is composed of one or more
	 *         ChannelComponents.  For example, an entire spectrum in an FTIR experiment may be stored in a single Logical Channel with each discrete wavenumber of the spectrum
	 *         constituting a ChannelComponent of the FTIR Logical Channel.  An RGB image where the Red, Green and Blue components do not reflect discrete probes but are
	 *         instead the output of a color camera would be treated similarly - one Logical channel with three ChannelComponents in this case.
	 *         The total number of ChannelComponents for a set of pixels must equal SizeC.
	 *         The IlluminationType attribute is a string enumeration which may be set to 'Transmitted', 'Epifluorescence', 'Oblique', or 'NonLinear'.
	 *         The user interface logic for labeling a given channel for the user should use the first existing attribute in the following sequence:
	 *         Name -> Fluor -> EmissionWavelength -> ChannelComponent/Index.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_Channel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Channel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChannelType> getChannel();

	/**
	 * Returns the value of the '<em><b>Bin Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.BinDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contents of this element are base64-encoded.  These are not CDATA sections, just a base64 stream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bin Data</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_BinData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BinDataType> getBinData();

	/**
	 * Returns the value of the '<em><b>Tiff Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.TiffDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This described the location of the pixel data in a tiff file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tiff Data</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_TiffData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TiffData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TiffDataType> getTiffData();

	/**
	 * Returns the value of the '<em><b>Metadata Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This place holder means there is on pixel data in this file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Only</em>' containment reference.
	 * @see #setMetadataOnly(EObject)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_MetadataOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MetadataOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getMetadataOnly();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getMetadataOnly <em>Metadata Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Only</em>' containment reference.
	 * @see #getMetadataOnly()
	 * @generated
	 */
	void setMetadataOnly(EObject value);

	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.PlaneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Plane object holds microscope stage and image timing data
	 *         for a given channel/z-section/timepoint.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_Plane()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plane' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlaneType> getPlane();

	/**
	 * Returns the value of the '<em><b>Big Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This is true if the pixels data was written in BigEndian order.
	 * 
	 *             If this value is present it should match the value used in BinData
	 *             or TiffData. If it does not a reader should honour the value used
	 *             in the BinData or TiffData. This values is useful for MetadataOnly
	 *             files and is to allow for future storage solutions.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big Endian</em>' attribute.
	 * @see #isSetBigEndian()
	 * @see #unsetBigEndian()
	 * @see #setBigEndian(boolean)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_BigEndian()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='BigEndian'"
	 * @generated
	 */
	boolean isBigEndian();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#isBigEndian <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Endian</em>' attribute.
	 * @see #isSetBigEndian()
	 * @see #unsetBigEndian()
	 * @see #isBigEndian()
	 * @generated
	 */
	void setBigEndian(boolean value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#isBigEndian <em>Big Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBigEndian()
	 * @see #isBigEndian()
	 * @see #setBigEndian(boolean)
	 * @generated
	 */
	void unsetBigEndian();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#isBigEndian <em>Big Endian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Big Endian</em>' attribute is set.
	 * @see #unsetBigEndian()
	 * @see #isBigEndian()
	 * @see #setBigEndian(boolean)
	 * @generated
	 */
	boolean isSetBigEndian();

	/**
	 * Returns the value of the '<em><b>Dimension Order</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.DimensionOrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The order in which the individual planes of data are interleaved.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension Order</em>' attribute.
	 * @see org.openmicroscopy.ome.DimensionOrderType
	 * @see #isSetDimensionOrder()
	 * @see #unsetDimensionOrder()
	 * @see #setDimensionOrder(DimensionOrderType)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_DimensionOrder()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='DimensionOrder'"
	 * @generated
	 */
	DimensionOrderType getDimensionOrder();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getDimensionOrder <em>Dimension Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Order</em>' attribute.
	 * @see org.openmicroscopy.ome.DimensionOrderType
	 * @see #isSetDimensionOrder()
	 * @see #unsetDimensionOrder()
	 * @see #getDimensionOrder()
	 * @generated
	 */
	void setDimensionOrder(DimensionOrderType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getDimensionOrder <em>Dimension Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDimensionOrder()
	 * @see #getDimensionOrder()
	 * @see #setDimensionOrder(DimensionOrderType)
	 * @generated
	 */
	void unsetDimensionOrder();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getDimensionOrder <em>Dimension Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dimension Order</em>' attribute is set.
	 * @see #unsetDimensionOrder()
	 * @see #getDimensionOrder()
	 * @see #setDimensionOrder(DimensionOrderType)
	 * @generated
	 */
	boolean isSetDimensionOrder();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_ID()
	 * @model dataType="org.openmicroscopy.ome.PixelsID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Interleaved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             How the channels are arranged within the data block:
	 *             true if channels are stored RGBRGBRGB...;
	 *             false if channels are stored RRR...GGG...BBB...
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interleaved</em>' attribute.
	 * @see #isSetInterleaved()
	 * @see #unsetInterleaved()
	 * @see #setInterleaved(boolean)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_Interleaved()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Interleaved'"
	 * @generated
	 */
	boolean isInterleaved();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#isInterleaved <em>Interleaved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interleaved</em>' attribute.
	 * @see #isSetInterleaved()
	 * @see #unsetInterleaved()
	 * @see #isInterleaved()
	 * @generated
	 */
	void setInterleaved(boolean value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#isInterleaved <em>Interleaved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterleaved()
	 * @see #isInterleaved()
	 * @see #setInterleaved(boolean)
	 * @generated
	 */
	void unsetInterleaved();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#isInterleaved <em>Interleaved</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interleaved</em>' attribute is set.
	 * @see #unsetInterleaved()
	 * @see #isInterleaved()
	 * @see #setInterleaved(boolean)
	 * @generated
	 */
	boolean isSetInterleaved();

	/**
	 * Returns the value of the '<em><b>Physical Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical size of a pixel. Units are set by PhysicalSizeXUnit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Size X</em>' attribute.
	 * @see #isSetPhysicalSizeX()
	 * @see #unsetPhysicalSizeX()
	 * @see #setPhysicalSizeX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_PhysicalSizeX()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='PhysicalSizeX'"
	 * @generated
	 */
	float getPhysicalSizeX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeX <em>Physical Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Size X</em>' attribute.
	 * @see #isSetPhysicalSizeX()
	 * @see #unsetPhysicalSizeX()
	 * @see #getPhysicalSizeX()
	 * @generated
	 */
	void setPhysicalSizeX(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeX <em>Physical Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalSizeX()
	 * @see #getPhysicalSizeX()
	 * @see #setPhysicalSizeX(float)
	 * @generated
	 */
	void unsetPhysicalSizeX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeX <em>Physical Size X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Size X</em>' attribute is set.
	 * @see #unsetPhysicalSizeX()
	 * @see #getPhysicalSizeX()
	 * @see #setPhysicalSizeX(float)
	 * @generated
	 */
	boolean isSetPhysicalSizeX();

	/**
	 * Returns the value of the '<em><b>Physical Size XUnit</b></em>' attribute.
	 * The default value is <code>"\u00b5m"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the physical size of a pixel - default:microns[µm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Size XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPhysicalSizeXUnit()
	 * @see #unsetPhysicalSizeXUnit()
	 * @see #setPhysicalSizeXUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_PhysicalSizeXUnit()
	 * @model default="\u00b5m" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PhysicalSizeXUnit'"
	 * @generated
	 */
	UnitsLength getPhysicalSizeXUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeXUnit <em>Physical Size XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Size XUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPhysicalSizeXUnit()
	 * @see #unsetPhysicalSizeXUnit()
	 * @see #getPhysicalSizeXUnit()
	 * @generated
	 */
	void setPhysicalSizeXUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeXUnit <em>Physical Size XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalSizeXUnit()
	 * @see #getPhysicalSizeXUnit()
	 * @see #setPhysicalSizeXUnit(UnitsLength)
	 * @generated
	 */
	void unsetPhysicalSizeXUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeXUnit <em>Physical Size XUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Size XUnit</em>' attribute is set.
	 * @see #unsetPhysicalSizeXUnit()
	 * @see #getPhysicalSizeXUnit()
	 * @see #setPhysicalSizeXUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetPhysicalSizeXUnit();

	/**
	 * Returns the value of the '<em><b>Physical Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical size of a pixel. Units are set by PhysicalSizeYUnit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Size Y</em>' attribute.
	 * @see #isSetPhysicalSizeY()
	 * @see #unsetPhysicalSizeY()
	 * @see #setPhysicalSizeY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_PhysicalSizeY()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='PhysicalSizeY'"
	 * @generated
	 */
	float getPhysicalSizeY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeY <em>Physical Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Size Y</em>' attribute.
	 * @see #isSetPhysicalSizeY()
	 * @see #unsetPhysicalSizeY()
	 * @see #getPhysicalSizeY()
	 * @generated
	 */
	void setPhysicalSizeY(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeY <em>Physical Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalSizeY()
	 * @see #getPhysicalSizeY()
	 * @see #setPhysicalSizeY(float)
	 * @generated
	 */
	void unsetPhysicalSizeY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeY <em>Physical Size Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Size Y</em>' attribute is set.
	 * @see #unsetPhysicalSizeY()
	 * @see #getPhysicalSizeY()
	 * @see #setPhysicalSizeY(float)
	 * @generated
	 */
	boolean isSetPhysicalSizeY();

	/**
	 * Returns the value of the '<em><b>Physical Size YUnit</b></em>' attribute.
	 * The default value is <code>"\u00b5m"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the physical size of a pixel - default:microns[µm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Size YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPhysicalSizeYUnit()
	 * @see #unsetPhysicalSizeYUnit()
	 * @see #setPhysicalSizeYUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_PhysicalSizeYUnit()
	 * @model default="\u00b5m" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PhysicalSizeYUnit'"
	 * @generated
	 */
	UnitsLength getPhysicalSizeYUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeYUnit <em>Physical Size YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Size YUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPhysicalSizeYUnit()
	 * @see #unsetPhysicalSizeYUnit()
	 * @see #getPhysicalSizeYUnit()
	 * @generated
	 */
	void setPhysicalSizeYUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeYUnit <em>Physical Size YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalSizeYUnit()
	 * @see #getPhysicalSizeYUnit()
	 * @see #setPhysicalSizeYUnit(UnitsLength)
	 * @generated
	 */
	void unsetPhysicalSizeYUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeYUnit <em>Physical Size YUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Size YUnit</em>' attribute is set.
	 * @see #unsetPhysicalSizeYUnit()
	 * @see #getPhysicalSizeYUnit()
	 * @see #setPhysicalSizeYUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetPhysicalSizeYUnit();

	/**
	 * Returns the value of the '<em><b>Physical Size Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical size of a pixel. Units are set by PhysicalSizeZUnit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Size Z</em>' attribute.
	 * @see #isSetPhysicalSizeZ()
	 * @see #unsetPhysicalSizeZ()
	 * @see #setPhysicalSizeZ(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_PhysicalSizeZ()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='PhysicalSizeZ'"
	 * @generated
	 */
	float getPhysicalSizeZ();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZ <em>Physical Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Size Z</em>' attribute.
	 * @see #isSetPhysicalSizeZ()
	 * @see #unsetPhysicalSizeZ()
	 * @see #getPhysicalSizeZ()
	 * @generated
	 */
	void setPhysicalSizeZ(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZ <em>Physical Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalSizeZ()
	 * @see #getPhysicalSizeZ()
	 * @see #setPhysicalSizeZ(float)
	 * @generated
	 */
	void unsetPhysicalSizeZ();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZ <em>Physical Size Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Size Z</em>' attribute is set.
	 * @see #unsetPhysicalSizeZ()
	 * @see #getPhysicalSizeZ()
	 * @see #setPhysicalSizeZ(float)
	 * @generated
	 */
	boolean isSetPhysicalSizeZ();

	/**
	 * Returns the value of the '<em><b>Physical Size ZUnit</b></em>' attribute.
	 * The default value is <code>"\u00b5m"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the physical size of a pixel - default:microns[µm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Size ZUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPhysicalSizeZUnit()
	 * @see #unsetPhysicalSizeZUnit()
	 * @see #setPhysicalSizeZUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_PhysicalSizeZUnit()
	 * @model default="\u00b5m" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PhysicalSizeZUnit'"
	 * @generated
	 */
	UnitsLength getPhysicalSizeZUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZUnit <em>Physical Size ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Size ZUnit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPhysicalSizeZUnit()
	 * @see #unsetPhysicalSizeZUnit()
	 * @see #getPhysicalSizeZUnit()
	 * @generated
	 */
	void setPhysicalSizeZUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZUnit <em>Physical Size ZUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalSizeZUnit()
	 * @see #getPhysicalSizeZUnit()
	 * @see #setPhysicalSizeZUnit(UnitsLength)
	 * @generated
	 */
	void unsetPhysicalSizeZUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getPhysicalSizeZUnit <em>Physical Size ZUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Size ZUnit</em>' attribute is set.
	 * @see #unsetPhysicalSizeZUnit()
	 * @see #getPhysicalSizeZUnit()
	 * @see #setPhysicalSizeZUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetPhysicalSizeZUnit();

	/**
	 * Returns the value of the '<em><b>Significant Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The number of bits within the type storing each pixel that are significant.
	 *             e.g. you can store 12 bit data within a 16 bit type.
	 *             This does not reduce the storage requirements but can be a useful indicator
	 *             when processing or viewing the image data.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Significant Bits</em>' attribute.
	 * @see #isSetSignificantBits()
	 * @see #unsetSignificantBits()
	 * @see #setSignificantBits(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_SignificantBits()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='SignificantBits'"
	 * @generated
	 */
	int getSignificantBits();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSignificantBits <em>Significant Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Bits</em>' attribute.
	 * @see #isSetSignificantBits()
	 * @see #unsetSignificantBits()
	 * @see #getSignificantBits()
	 * @generated
	 */
	void setSignificantBits(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSignificantBits <em>Significant Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignificantBits()
	 * @see #getSignificantBits()
	 * @see #setSignificantBits(int)
	 * @generated
	 */
	void unsetSignificantBits();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getSignificantBits <em>Significant Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Significant Bits</em>' attribute is set.
	 * @see #unsetSignificantBits()
	 * @see #getSignificantBits()
	 * @see #setSignificantBits(int)
	 * @generated
	 */
	boolean isSetSignificantBits();

	/**
	 * Returns the value of the '<em><b>Size C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensional size of pixel data array [units:none]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size C</em>' attribute.
	 * @see #isSetSizeC()
	 * @see #unsetSizeC()
	 * @see #setSizeC(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_SizeC()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt" required="true"
	 *        extendedMetaData="kind='attribute' name='SizeC'"
	 * @generated
	 */
	int getSizeC();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeC <em>Size C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size C</em>' attribute.
	 * @see #isSetSizeC()
	 * @see #unsetSizeC()
	 * @see #getSizeC()
	 * @generated
	 */
	void setSizeC(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeC <em>Size C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeC()
	 * @see #getSizeC()
	 * @see #setSizeC(int)
	 * @generated
	 */
	void unsetSizeC();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeC <em>Size C</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size C</em>' attribute is set.
	 * @see #unsetSizeC()
	 * @see #getSizeC()
	 * @see #setSizeC(int)
	 * @generated
	 */
	boolean isSetSizeC();

	/**
	 * Returns the value of the '<em><b>Size T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensional size of pixel data array [units:none]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size T</em>' attribute.
	 * @see #isSetSizeT()
	 * @see #unsetSizeT()
	 * @see #setSizeT(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_SizeT()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt" required="true"
	 *        extendedMetaData="kind='attribute' name='SizeT'"
	 * @generated
	 */
	int getSizeT();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeT <em>Size T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size T</em>' attribute.
	 * @see #isSetSizeT()
	 * @see #unsetSizeT()
	 * @see #getSizeT()
	 * @generated
	 */
	void setSizeT(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeT <em>Size T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeT()
	 * @see #getSizeT()
	 * @see #setSizeT(int)
	 * @generated
	 */
	void unsetSizeT();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeT <em>Size T</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size T</em>' attribute is set.
	 * @see #unsetSizeT()
	 * @see #getSizeT()
	 * @see #setSizeT(int)
	 * @generated
	 */
	boolean isSetSizeT();

	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensional size of pixel data array [units:none]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #isSetSizeX()
	 * @see #unsetSizeX()
	 * @see #setSizeX(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_SizeX()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt" required="true"
	 *        extendedMetaData="kind='attribute' name='SizeX'"
	 * @generated
	 */
	int getSizeX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeX <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size X</em>' attribute.
	 * @see #isSetSizeX()
	 * @see #unsetSizeX()
	 * @see #getSizeX()
	 * @generated
	 */
	void setSizeX(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeX <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeX()
	 * @see #getSizeX()
	 * @see #setSizeX(int)
	 * @generated
	 */
	void unsetSizeX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeX <em>Size X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size X</em>' attribute is set.
	 * @see #unsetSizeX()
	 * @see #getSizeX()
	 * @see #setSizeX(int)
	 * @generated
	 */
	boolean isSetSizeX();

	/**
	 * Returns the value of the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensional size of pixel data array [units:none]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Y</em>' attribute.
	 * @see #isSetSizeY()
	 * @see #unsetSizeY()
	 * @see #setSizeY(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_SizeY()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt" required="true"
	 *        extendedMetaData="kind='attribute' name='SizeY'"
	 * @generated
	 */
	int getSizeY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #isSetSizeY()
	 * @see #unsetSizeY()
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeY()
	 * @see #getSizeY()
	 * @see #setSizeY(int)
	 * @generated
	 */
	void unsetSizeY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeY <em>Size Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Y</em>' attribute is set.
	 * @see #unsetSizeY()
	 * @see #getSizeY()
	 * @see #setSizeY(int)
	 * @generated
	 */
	boolean isSetSizeY();

	/**
	 * Returns the value of the '<em><b>Size Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensional size of pixel data array [units:none]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Z</em>' attribute.
	 * @see #isSetSizeZ()
	 * @see #unsetSizeZ()
	 * @see #setSizeZ(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_SizeZ()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt" required="true"
	 *        extendedMetaData="kind='attribute' name='SizeZ'"
	 * @generated
	 */
	int getSizeZ();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeZ <em>Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Z</em>' attribute.
	 * @see #isSetSizeZ()
	 * @see #unsetSizeZ()
	 * @see #getSizeZ()
	 * @generated
	 */
	void setSizeZ(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeZ <em>Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeZ()
	 * @see #getSizeZ()
	 * @see #setSizeZ(int)
	 * @generated
	 */
	void unsetSizeZ();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getSizeZ <em>Size Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Z</em>' attribute is set.
	 * @see #unsetSizeZ()
	 * @see #getSizeZ()
	 * @see #setSizeZ(int)
	 * @generated
	 */
	boolean isSetSizeZ();

	/**
	 * Returns the value of the '<em><b>Time Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             TimeIncrement is used for time series that have a global
	 *             timing specification instead of per-timepoint timing info.
	 *             For example in a video stream. Units are set by TimeIncrementUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Increment</em>' attribute.
	 * @see #isSetTimeIncrement()
	 * @see #unsetTimeIncrement()
	 * @see #setTimeIncrement(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_TimeIncrement()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='TimeIncrement'"
	 * @generated
	 */
	float getTimeIncrement();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrement <em>Time Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Increment</em>' attribute.
	 * @see #isSetTimeIncrement()
	 * @see #unsetTimeIncrement()
	 * @see #getTimeIncrement()
	 * @generated
	 */
	void setTimeIncrement(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrement <em>Time Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeIncrement()
	 * @see #getTimeIncrement()
	 * @see #setTimeIncrement(float)
	 * @generated
	 */
	void unsetTimeIncrement();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrement <em>Time Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Increment</em>' attribute is set.
	 * @see #unsetTimeIncrement()
	 * @see #getTimeIncrement()
	 * @see #setTimeIncrement(float)
	 * @generated
	 */
	boolean isSetTimeIncrement();

	/**
	 * Returns the value of the '<em><b>Time Increment Unit</b></em>' attribute.
	 * The default value is <code>"s"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the TimeIncrement - default:seconds[s].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Increment Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see #isSetTimeIncrementUnit()
	 * @see #unsetTimeIncrementUnit()
	 * @see #setTimeIncrementUnit(UnitsTime)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_TimeIncrementUnit()
	 * @model default="s" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='TimeIncrementUnit'"
	 * @generated
	 */
	UnitsTime getTimeIncrementUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrementUnit <em>Time Increment Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Increment Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsTime
	 * @see #isSetTimeIncrementUnit()
	 * @see #unsetTimeIncrementUnit()
	 * @see #getTimeIncrementUnit()
	 * @generated
	 */
	void setTimeIncrementUnit(UnitsTime value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrementUnit <em>Time Increment Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeIncrementUnit()
	 * @see #getTimeIncrementUnit()
	 * @see #setTimeIncrementUnit(UnitsTime)
	 * @generated
	 */
	void unsetTimeIncrementUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getTimeIncrementUnit <em>Time Increment Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Increment Unit</em>' attribute is set.
	 * @see #unsetTimeIncrementUnit()
	 * @see #getTimeIncrementUnit()
	 * @see #setTimeIncrementUnit(UnitsTime)
	 * @generated
	 */
	boolean isSetTimeIncrementUnit();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.PixelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The variable type used to represent each pixel in the image.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.PixelType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(PixelType)
	 * @see org.openmicroscopy.ome.OMEPackage#getPixelsType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	PixelType getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PixelsType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.PixelType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(PixelType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.PixelsType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PixelType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.PixelsType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PixelType)
	 * @generated
	 */
	boolean isSetType();

} // PixelsType
