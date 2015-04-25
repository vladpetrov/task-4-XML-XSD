<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xsi:schemaLocation="http://www.epam.by/Hangar Hangar.xsd"
                xmlns:han="http://www.epam.by/Hangar">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Hangar</title>
            </head>
            <body>
                <h1>Hangar</h1>
                <table border="1">
                    <th>Origin</th>
                    <th>Type</th>
                    <th>Seats</th>
                    <th>Radar</th>
                    <th>Rockets</th>
                    <th>Machine guns</th>
                    <th>Length</th>
                    <th>Width</th>
                    <th>Height</th>
                    <th>Price</th>
                    <xsl:for-each select="han:hangar/plane">
                        <xsl:sort select="price" data-type="number"/>
                        <tr>
                            <td><xsl:value-of select="origin"/></td>
                            <td><xsl:value-of select="chars/type"/></td>
                            <td><xsl:value-of select="chars/seats"/></td>
                            <td><xsl:value-of select="chars/radar"/></td>
                            <td><xsl:value-of select="chars/ammunition/rockets"/></td>
                            <td><xsl:value-of select="chars/ammunition/machine_guns"/></td>
                            <td><xsl:value-of select="parameters/length"/></td>
                            <td><xsl:value-of select="parameters/width"/></td>
                            <td><xsl:value-of select="parameters/height"/></td>
                            <td><xsl:value-of select="price"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>